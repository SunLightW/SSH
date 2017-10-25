package cn.jasmine.controller.admin;


import cn.jasmine.entity.admin.User;
import cn.jasmine.service.admin.UserService;
import cn.jasmine.utils.Back2JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登陆Controller
 */
@Controller
@RequestMapping("/admin")
public class LoginController {


    @Autowired
    private UserService userService;

    /**
     * 登录跳转页面
     * @return
     */
    @RequestMapping("/login")
    public String login(ModelMap model){
        return "admin/login";
    }


    /**
     * 检查用户名是否被占用
     */
    @RequestMapping("/checkusername")
    @ResponseBody
    public String checkUsername(){
        User user = new User();
        user.setId(22L);
        user.setNickname("jasmine");
        user.setUsername("qianlili");
        user.setPassword("jasmine0214");
        return Back2JsonUtil.toJSON(user);
    }




}
