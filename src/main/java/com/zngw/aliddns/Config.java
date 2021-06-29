package com.zngw.aliddns;

/**
 * ItemLogReason class
 *
 * @author 55
 * @date 2021/6/28
 */
public class Config {
    public String regionId;         // 地域ID,"cn-hangzhou"
    public String accessKeyId;      // 您的AccessKey ID
    public String secret;
    public String tld;              // 顶级域名
    public String rr;               // 子域名
    public int dnsInterval;         // 查询dns服务器间隔(秒)
    public int ipInterval;          // 查询本地公网IP间隔(秒)
}
