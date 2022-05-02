package com.kosh.springredis;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.Date;

@RedisHash("blocked_user")
@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BlockedUser implements Serializable {
    @Id
    private String appUserId;
    private boolean userAcceptedBlockedStatus;
    private Date blocked;
}