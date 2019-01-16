package cn.itcast.dao;

import cn.itcast.domain.Users;
import org.springframework.stereotype.Repository;

/**
 * 用户登录操作
 */
@Repository("loginUserDao")
public interface LoginUserDao {
    //通过用户名查找用户信息
    Users findUserByName(String name) throws Exception;
}
