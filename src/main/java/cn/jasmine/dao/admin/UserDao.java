package cn.jasmine.dao.admin;


import cn.jasmine.entity.admin.User;

import java.util.List;

/**
 * 用户查询dao
 */
public interface UserDao {

    /**
     * 用户名查询用户(是否有这个用户名)
     * @param username
     * @return
     */
    List<User> findUserByUsername(String username);
}
