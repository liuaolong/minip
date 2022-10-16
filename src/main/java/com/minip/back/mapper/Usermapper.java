package com.minip.back.mapper;

import com.minip.back.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Usermapper {
    @Select("select *  from user_test")
    List<User> findAll();

}
