package com.qztlgs.account.dao;

import com.qztlgs.account.bean.User;
import com.qztlgs.account.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @filename: UserMapperTest
 * @description:
 * @author: 撸代码的奥特曼
 * @data:2021/2/8
 */
public class UserMapperTest {
    @Test
    public void testGetUsers(){
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()){
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = mapper.getUsers();
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}
