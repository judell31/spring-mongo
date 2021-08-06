package com.judell.springmongo.resp;

import com.judell.springmongo.model.User;

public class UserResp {
    public String id;
    public String firstName;
    public String lastName;

    public UserResp(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
    }
}
