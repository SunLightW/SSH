package cn.jasmine.dao.admin;

import cn.jasmine.entity.admin.Index;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.PrivateKey;
import java.util.List;

/**
 * 首页dao接口
 */
public interface IndexDao {

    List<Index> findAllIndexInfo();


}
