package com.rian.starter.services.v1;

import com.rian.starter.model.v1.ResOrder;
import com.rian.starter.model.v1.ResUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface Services {

    List<ResUser> findUserByAll();
    ResUser findUserByUserId(String userId);
    void addUser(ResUser resUser);
    void updateUser(ResUser resUser);

    List<ResOrder> findOrderByNoVa(String noVa);
    void addResOrder(ResOrder resOrder);
}