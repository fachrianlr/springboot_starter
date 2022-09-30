package com.rian.starter.services.v1;

import com.rian.starter.model.v1.*;
import com.rian.starter.processor.v1.ProcessorImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/rian/api/v1")
public class ServicesImpl implements Services {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    ProcessorImpl processor;

    @Override
    @GetMapping(value = "/findUserByUserId/{userId}", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResUser findUserByUserId(@PathVariable String userId) {
        ResUser data = processor.findResUserByUserId(userId);
        return data;
    }

    @Override
    @GetMapping(value = "/findUserAll", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<ResUser> findUserByAll() {
        List<ResUser> resUserList = processor.findResUserAll();
        return resUserList;
    }

    @Override
    @PostMapping(value = "/addUser", produces= MediaType.APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody ResUser resUser) {
        processor.saveResUser(resUser);
    }

    @Override
    @PostMapping(value = "/updateUser", produces= MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@RequestBody ResUser resUser) {
        processor.updateResUser(resUser);
    }

    @Override
    @GetMapping(value = "/findOrderByNoVa/{noVa}", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<ResOrder> findOrderByNoVa(@PathVariable String noVa) {
        List<ResOrder> data = processor.findOrderByNoVa(noVa);
        return data;
    }

    @Override
    @PostMapping(value = "/addResOrder", produces= MediaType.APPLICATION_JSON_VALUE)
    public void addResOrder(@RequestBody ResOrder resOrder) {
        logger.info(resOrder.toString());
        ResOrderLine resOrderLine = new ResOrderLine();
        
        ResMerchant resMerchant = processor.findResMerchantByName(resOrder.getMerchantId().getMerchantName());
        ResSchool resSchool = processor.findResSchoolByName(resOrder.getSchoolId().getSchoolName());
        ResOrder resOrder1 = new ResOrder();
        resOrder1.setNoVa(resOrder.getNoVa());
        resOrder1.setNoReff(resOrder.getNoReff());
        resOrder1.setMerchantId(resMerchant);
        resOrder1.setSchoolId(resSchool);
        resOrder1.setKeterangan(resOrder1.getKeterangan());
        processor.saveResOrder(resOrder1);
    }
}
