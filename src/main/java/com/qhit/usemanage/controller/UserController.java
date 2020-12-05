package com.qhit.usemanage.controller;

import com.qhit.usemanage.pojo.User;
import com.qhit.usemanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/login")
    public ModelAndView login(String username, String password) {
        User user = userService.login(username, password);

        ModelAndView modelAndView = new ModelAndView();
        if (user!= null){
            List<User> all = userService.findAll();
            modelAndView.addObject("userList",all);
        }
        modelAndView.setViewName("userList");

        return modelAndView;
    }

    @PostMapping("/add")
    public ModelAndView add(String username, String password) {
        userService.add(username, password);
        ModelAndView modelAndView = new ModelAndView();
        List<User> all = userService.findAll();
        modelAndView.setViewName("userList");
        modelAndView.addObject("userList",all);
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView update(Integer id,String username, String password) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        ModelAndView modelAndView = new ModelAndView();
        userService.update(user);
        List<User> all = userService.findAll();
        modelAndView.setViewName("userList");
        modelAndView.addObject("userList",all);
        return modelAndView;
    }
    @GetMapping("/findById")
    public ModelAndView findById(Integer id) {

        ModelAndView modelAndView = new ModelAndView();

        User user = userService.findById(id);
        modelAndView.setViewName("userUpdate");
        modelAndView.addObject("user",user);
        return modelAndView;
    }


}
