package com.syedbaqirali.user.controller;

import com.syedbaqirali.user.entity.User;
import com.syedbaqirali.user.service.UserService;
import com.syedbaqirali.user.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/h2/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("UserController: Saving User: " + user);
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO findUserById(@PathVariable("id") Long userId){
        log.info("UserController: Finding User: " + userId);
        return userService.findUserWithDepartment(userId);
    }


    @GetMapping("/")
    public List<User> findAll(){
        log.info("UserController: Finding All Users: ");
        return userService.findAll();
    }
}
