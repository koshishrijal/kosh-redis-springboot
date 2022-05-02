package com.kosh.springredis;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

@SpringBootApplication
//@EnableRedisRepositories
public class SpringredisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringredisApplication.class, args);
    }







    @Component
    class Runner implements CommandLineRunner {

        @Autowired
        private BlockedUserRepository blockedUserRepository;


        @Override
        public void run(String... args) throws Exception {
            BlockedUser user = new BlockedUser();
            user.setAppUserId("bhjnm");
            user.setBlocked(new Date());
            user.setUserAcceptedBlockedStatus(false);
            user = blockedUserRepository.save(user);
            System.out.println(user);

        }
    }

}
