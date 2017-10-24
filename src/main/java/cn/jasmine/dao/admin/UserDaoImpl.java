package cn.jasmine.dao.admin;


import cn.jasmine.entity.admin.User;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户dao实现类
 */
@Repository
public class UserDaoImpl  implements UserDao{

    @Resource
    private SessionFactory sessionFactory;


    /**
     * 用户名查询用户(是否有这个用户名)
     * @param username
     * @return
     */
    public List<User> findUserByUsername(String username) {
        Session session = sessionFactory.getCurrentSession();
        String sql = "SELECT * FROM user WHERE username = "+username+"";
        List<User> list = session.createSQLQuery(sql).addEntity(User.class).list();
        return list;
    }
}
