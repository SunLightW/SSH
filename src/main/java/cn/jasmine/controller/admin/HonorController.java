package cn.jasmine.controller.admin;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 荣耀Controller
 */

@Controller()
//@RequestMapping("/honor")
public class HonorController {



    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        return "admin/WEB-INF/index";
    }

}
