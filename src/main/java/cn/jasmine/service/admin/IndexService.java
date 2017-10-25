package cn.jasmine.service.admin;

import cn.jasmine.dao.admin.IndexDaoImpl;
import cn.jasmine.entity.admin.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class IndexService {

    @Autowired
    private IndexDaoImpl indexDao;


    /**
     * 查询所有index信息
     * @return
     */
    public List<Index> findAllIndexInfo(){
        return indexDao.findAllIndexInfo();
    }
}
