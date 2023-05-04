package com.dockerprog.dao;

import com.dockerprog.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User findUserByName(@Param("name")String name);
}
