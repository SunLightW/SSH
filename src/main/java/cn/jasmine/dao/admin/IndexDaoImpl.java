package cn.jasmine.dao.admin;


import cn.jasmine.entity.admin.Index;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 首页dao实现类
 */

@Repository
public class IndexDaoImpl implements IndexDao {


    @Autowired
    private SessionFactory sessionFactory;

    /**
     * 查询所有的index信息
     * @return
     */
    public List<Index> findAllIndexInfo() {
        Session session = sessionFactory.getCurrentSession();
        String sql = "SELECT * FROM index";
        List<Index> list = session.createSQLQuery(sql).addEntity(Index.class).list();
        return list;
    }
}
