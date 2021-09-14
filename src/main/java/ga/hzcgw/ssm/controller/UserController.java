package ga.hzcgw.ssm.controller;

import ga.hzcgw.ssm.po.User;
import ga.hzcgw.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(Model model) {

        //int i = 1/0;
        /*if (true) {
            throw new BusinessException();
        }*/

        User user = userService.queryUserByUserId(1);
        model.addAttribute("user", user);

        return "hello";
    }
}
