package com.taiwan.domain;

import lombok.Data;

@Data
public class RequestRateLimit {
    private String path;
    private int maxRequests;
    private long interval;

    public RequestRateLimit(String path, int maxRequests, long interval) {
        this.path = path;
        this.maxRequests = maxRequests;// 限制的请求数
        this.interval = interval;// 时间间隔，单位为毫秒
    }

}
