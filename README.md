# BillNo Server 
提供分布式单号服务

## 协议
`entity/pb/billno.proto`

```protobuf
// 单号服务
service Billno {
  // 获取单号
  rpc GetBillno(GetBillnoReq) returns(GetBillnoResp) {};
}
```

## 代码生成
### 依赖安装

1、下载 [protoc](https://github.com/protocolbuffers/protobuf/releases)   
2、设置环境变量
```shell
export PATH=$PATH:安装目录/bin
```

**Go 语言依赖**  
1、安装`protoc go` 插件
```shell
go install google.golang.org/protobuf/cmd/protoc-gen-go@latest
go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@latest
# 安装验证插件
git clone https://github.com/bufbuild/protoc-gen-validate.git
# installs PGV into $GOPATH/bin
cd protoc-gen-validate && make build

```

2、加入到环境变量
```shell
export PATH="$PATH:$(go env GOPATH)/bin"
```
3、执行命令
```shell
# go_opt go_grpc_opt 设置代码采用相对路径，不设置则按go_package中完整路径生成
protoc --go_out=. --go-grpc_out=. --go_opt=paths=source_relative --validate_out="lang=go,paths=source_relative:."  *.proto
```

**Java 语言依赖**  
1、下载 [protoc-gen-grpc-java](https://mvnrepository.com/artifact/io.grpc/protoc-gen-grpc-java)
> 下载对应操作系统，--plugin=引用这个文件

2、执行命令
```shell
protoc --plugin=protoc-gen-grpc-java --grpc-java_out=. --java_out=. --validate_out="lang=java:."  *.proto
```