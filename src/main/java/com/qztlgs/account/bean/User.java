package com.qztlgs.account.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @filename: User
 * @description: 用户实体类
 * @author: 撸代码的奥特曼
 * @data:2021/2/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private String realname;
    private String password;
    private String email;
}
