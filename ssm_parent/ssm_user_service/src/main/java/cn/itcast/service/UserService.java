package cn.itcast.service;

import cn.itcast.domain.Users;

public interface UserService {
    //注册添加用户
    void saveUser(Users users) throws Exception;
}
