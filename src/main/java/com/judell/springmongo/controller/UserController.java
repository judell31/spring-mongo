package com.judell.springmongo.controller;

import com.judell.springmongo.req.AddUserReq;
import com.judell.springmongo.resp.UserResp;
import com.judell.springmongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get-users")
    public List<UserResp> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/add-user")
    public UserResp addUser(@RequestBody AddUserReq adduserReq) {
        return userService.addUser(adduserReq);
    }
}
