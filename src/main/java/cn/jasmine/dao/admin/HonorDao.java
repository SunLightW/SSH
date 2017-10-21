package cn.jasmine.dao.admin;


import cn.jasmine.entity.admin.Honor;

import java.util.List;

/**
 * 荣耀Dao接口
 */
public interface HonorDao {

    List<Honor> findAllHonor();
}
