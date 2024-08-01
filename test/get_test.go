package test

import (
	"billno-server/entity/pb"
	"context"
	"fmt"
	log "github.com/sirupsen/logrus"
	"sync"
	"testing"
)

func BenchmarkName(b *testing.B) {
	for i := 0; i < b.N; i++ {
		if billno, err := client.GetBillno(context.Background(), &pb.GetBillnoReq{
			BizCode: "test",
		}); err != nil {
			panic(err)
		} else {
			log.Infof("bill is %d", billno.Billno)
		}
	}
}

func TestGet(t *testing.T) {
	group := sync.WaitGroup{}
	group.Add(1000)
	for i := 0; i < 1000; i++ {
		go func() {
			if billno, err := client.GetBillno(context.Background(), &pb.GetBillnoReq{
				BizCode: "test",
			}); err != nil {
				panic(err)
			} else {
				log.Infof("bill is %d", billno.Billno)
			}
			group.Done()
		}()
	}
	group.Wait()
	fmt.Println("success")
}