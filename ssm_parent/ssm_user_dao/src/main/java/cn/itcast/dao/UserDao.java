package cn.itcast.dao;

import cn.itcast.domain.Users;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public interface UserDao {

    //注册添加用户
    void saveUser(Users users) throws Exception;
}
