package cn.jasmine.dao;


import cn.jasmine.entity.admin.Honor;
import com.alibaba.fastjson.JSON;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试连接
 */
public class TestConn {

    @Resource
    private SessionFactory sessionFactory;

    @Test
    public void test1(){
        Session session = sessionFactory.getCurrentSession();
//        Criteria criteria = session.createCriteria(Honor.class);
        Criteria criteria = session.createCriteria(Honor.class, "jasmine");
        List list = criteria.list();
        System.out.print(list);

    }


    @Test
    public void  test2(){
        boolean a = true;
        Object json = JSON.toJSON(a);
        System.out.print(json);

    }


}
