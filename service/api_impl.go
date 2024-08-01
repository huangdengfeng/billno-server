package service

import (
	"billno-server/entity/pb"
	"billno-server/logic"
	"billno-server/repo/dao"
	"context"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/status"
)

type billnoServerImpl struct {
	pb.UnimplementedBillnoServer
	billnoService logic.BillnoService
}

func NewBillnoServer(billnoDao dao.BillnoDao) pb.BillnoServer {
	return &billnoServerImpl{
		billnoService: logic.NewBillnoService(billnoDao),
	}
}

func (b *billnoServerImpl) GetBillno(ctx context.Context, req *pb.GetBillnoReq) (*pb.GetBillnoResp, error) {
	billno, err := b.billnoService.GetBillno(req.BizCode)
	if err != nil {
		return nil, status.Error(codes.Internal, err.Error())
	}
	return &pb.GetBillnoResp{Billno: billno}, nil
}
