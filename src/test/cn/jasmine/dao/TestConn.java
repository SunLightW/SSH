package cn.jasmine.dao;


import cn.jasmine.dao.admin.IndexDaoImpl;
import cn.jasmine.dao.admin.UserDaoImpl;
import cn.jasmine.entity.admin.Honor;
import cn.jasmine.entity.admin.Index;
import com.alibaba.druid.pool.vendor.SybaseExceptionSorter;
import com.alibaba.fastjson.JSON;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试连接
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml"})
public class TestConn {


    @Resource
    private IndexDaoImpl indexDao;

    @Test
    public void test(){
        List<Index> indexList = indexDao.findAllIndexInfo();
        System.out.print(indexList);
    }
}
