package cn.jasmine.dao.admin;

import cn.jasmine.entity.admin.Honor;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HonorDaoImpl implements HonorDao {

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * 获得会话session
     * @return
     */
    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }


    /**
     * 查询所有Honor
     * @return
     */
    @Override
    public List<Honor> findAllHonor() {
        Session session = getCurrentSession();
        String sql = "SELECT * FROM honor ";
        List list = session.createSQLQuery(sql).list();
        return list;
    }
}
