package com.qztlgs.account.dao;

import com.qztlgs.account.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @filename: UserMapper
 * @description:
 * @author: 撸代码的奥特曼
 * @data:2021/2/8
 */
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    List<User> getUsers();
}
