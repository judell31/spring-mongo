package com.judell.springmongo.service;

import com.judell.springmongo.dao.UserDao;
import com.judell.springmongo.model.User;
import com.judell.springmongo.req.AddUserReq;
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
        List<User> users = userDao.findAll();
        List<UserResp> userResp = new ArrayList<>();

        for (User userModel : users) {
            userResp.add(new UserResp(userModel));
        }

        return userResp;
    }

    public UserResp addUser(AddUserReq addUserReq) {
        User user = new User();

        user.setFirstName(addUserReq.firstName);
        user.setLastName(addUserReq.lastName);

        userDao.insert(user);

        return new UserResp(user);
    }
}
