# aliddns
阿里云动态DDNS配置的maven项目

## 配置文件说明

```json
{
  "regionId": "cn-hangzhou",
  "accessKeyId": "前面创建账号的AccessKeyID",
  "secret": "前面创建账号的AccessKey Secret",
  "tld":"zengwu.com.cn",
  "rr": "a",
  "dnsInterval": 86400,
  "ipInterval": 10
}
```

* regionId: 区域,域名管理一般是杭州"cn-hangzhou"
* accessKeyId: 前面创建账号的AccessKeyID
* secret: 前面创建账号的AccessKey Secret
* tld: 顶级域名
* rr: 主机名
* dnsInterval: 检查阿里云DNS配置的间隔时间(秒)
* ipInterval: 检查本地公网IP的间隔时间(秒)

## 启动

编译好jar程序，将jar和config.json放到同一目录下,直接后台运行jar就可以了。