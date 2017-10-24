package cn.jasmine.controller.admin;


import cn.jasmine.service.admin.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登陆Controller
 */
@Controller
//@RequestMapping("/admin")
public class LoginController {


    @Autowired
    private UserService userService;

    /**
     * 登录跳转页面
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        return "admin/login";
    }


    /**
     * 检查用户名是否被占用
     * @param request
     * @param response
     */
    @RequestMapping("/checkusername")
    public void checkUsername(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        boolean haveUsername = userService.findUserByUsername(username);
        String s = JSON.toJSONString(haveUsername);

    }




}
