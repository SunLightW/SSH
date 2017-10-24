package cn.jasmine.service.admin;


import cn.jasmine.dao.admin.UserDaoImpl;
import cn.jasmine.entity.admin.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户service
 */
@Service
public class UserService {

    @Autowired
    private UserDaoImpl userDao;


    /**
     * 查看数据库中是否有此用户名
     * @param username
     * @return
     */
    public boolean findUserByUsername(String username){
        List<User> userList = userDao.findUserByUsername(username);
        //list中是否有值来判定是否有此用户名
        if (userList.size() > 0){
            return true;
        }else {
            return false;
        }
    }
}
