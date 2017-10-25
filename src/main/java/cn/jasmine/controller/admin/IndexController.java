package cn.jasmine.controller.admin;


import cn.jasmine.entity.admin.Index;
import cn.jasmine.service.admin.IndexService;
import cn.jasmine.utils.Back2JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 首页controller
 */
@Controller()
@RequestMapping("/admin")
public class IndexController {

    @Autowired
    private IndexService indexService;


    /**
     * 查询所有index信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/showAllIndexInfo")
    public String findAllIndexInfo(){
        List<Index> indexList = indexService.findAllIndexInfo();
        String json = Back2JsonUtil.toJSON(indexList);
        return json;
    }




}
