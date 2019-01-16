package cn.itcast.service.impl;

import cn.itcast.dao.LoginUserDao;
import cn.itcast.domain.Users;
import cn.itcast.service.LoginUserService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("loginUserService")
public class LoginUserServiceImpl implements LoginUserService {
    @Resource
    private LoginUserDao loginUserDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users myUser=null;
        User user=null;
        try{
            myUser = loginUserDao.findUserByName(username);

            List<SimpleGrantedAuthority> authority = new ArrayList<>();
            authority.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            //将对user对象转为UserDetails并获得权限
            System.out.println(myUser);
            user = new User(myUser.getUsername(),"{noop}"+myUser.getPassword(),
                    myUser.getState() == 0 ? false : true, true,
                    true, true,authority);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return user;
    }

//    //作用就是返回一个List集合，集合中装入的是角色描述
//    public List<SimpleGrantedAuthority> getAuthority() {
//
//        List<SimpleGrantedAuthority> authority = new ArrayList<>();
//        authority.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
//
//        return authority;
//    }

}
