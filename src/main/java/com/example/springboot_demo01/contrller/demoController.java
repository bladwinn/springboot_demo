package com.example.springboot_demo01.contrller;



import com.example.springboot_demo01.pojo.Dept;
import com.example.springboot_demo01.pojo.User;
import com.example.springboot_demo01.service.UserService;
import com.example.springboot_demo01.service.deptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class demoController {

    @Autowired
    deptService deptService;

    @Autowired
    UserService userService;

    @GetMapping({"/","/index"})
    public String gotoIndex(){
        return "redirect:/main.html";
    }

    @GetMapping("/main.html")
    public String main(){
        return "main";
    }

    @GetMapping("/dept")
    @ResponseBody
    public Dept getById(@RequestParam("id") Integer id){
        Dept user = deptService.getUserById(id);

        return user;
    }

    @GetMapping("/getAll")
    public String getAllUser(Model model){
        List<User> users = userService.list();
        model.addAttribute("users",users);
        return "table_user";
    }
}
