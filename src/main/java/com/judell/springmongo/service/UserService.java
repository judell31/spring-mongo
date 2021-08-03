package com.judell.springmongo.service;

import com.judell.springmongo.dao.UserDao;
import com.judell.springmongo.model.Users;
import com.judell.springmongo.resp.UserResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<UserResp> getUsers() {
        List<Users> users = userDao.findAll();
        List<UserResp> userResps = new ArrayList<>();

        for (Users userModel : users) {
            userResps.add(new UserResp(userModel));
        }

        return userResps;
    }
}
