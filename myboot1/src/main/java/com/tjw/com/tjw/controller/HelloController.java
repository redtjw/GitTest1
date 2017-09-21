package com.tjw.com.tjw.controller;

import com.tjw.domain.User;
import com.tjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jingwen.tang
 * Created ON 2017/9/20 下午 09:17.
 * @Position Beijing
 */
@RestController
public class HelloController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "你好";
    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable("id") String id){
        return userService.getUserById(id);
    }
}
