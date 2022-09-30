package com.rian.starter.processor.v1;

import com.rian.starter.model.v1.ResMerchant;
import com.rian.starter.model.v1.ResOrder;
import com.rian.starter.model.v1.ResSchool;
import com.rian.starter.model.v1.ResUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface Processor {
    ResSchool findResSchoolByName(String name);

    ResMerchant findResMerchantByName(String name);
    void saveResMerchant(ResMerchant resMerchant);

    List<ResUser> findResUserAll();
    ResUser findResUserByUserId(String userId);
    void saveResUser(ResUser resUser);
    void updateResUser(ResUser resUser);

    List<ResOrder> findOrderByNoVa(String noVa);
    void saveResOrder(ResOrder resOrder);
}
