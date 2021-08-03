package com.judell.springmongo.resp;

import com.judell.springmongo.model.Users;

public class UserResp {
    private Integer id;
    public String firstName;
    public String lastName;

    public UserResp(Users users) {
        this.id = users.getId();
        this.firstName = users.getFirstName();
        this.lastName = users.getLastName();
    }
}
