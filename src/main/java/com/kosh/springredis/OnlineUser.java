package com.kosh.springredis;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.Date;

@RedisHash("online_user")
@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class OnlineUser implements Serializable {
    @Id
    private String appUserId;
    private String displayName;
    private String imageUrl;
    private Date lastActive;
}
