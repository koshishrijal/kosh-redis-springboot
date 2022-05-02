package com.kosh.springredis;


import org.springframework.data.repository.CrudRepository;

interface BlockedUserRepository extends CrudRepository<BlockedUser, String> {

}