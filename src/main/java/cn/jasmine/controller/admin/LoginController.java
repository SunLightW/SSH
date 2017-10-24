package cn.jasmine.controller.admin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登陆Controller
 */
@Controller
//@RequestMapping("/admin")
public class LoginController {


    @RequestMapping("/login")
    public String login(){
        return "admin/login";
    }

}
