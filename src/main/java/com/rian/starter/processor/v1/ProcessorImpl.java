package com.rian.starter.processor.v1;

import com.rian.starter.model.v1.ResMerchant;
import com.rian.starter.model.v1.ResOrder;
import com.rian.starter.model.v1.ResSchool;
import com.rian.starter.model.v1.ResUser;
import com.rian.starter.repository.ResMerchantRepository;
import com.rian.starter.repository.ResOrderRepository;
import com.rian.starter.repository.ResSchoolRepository;
import com.rian.starter.repository.ResUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;


@Service
public class ProcessorImpl implements Processor {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    ResSchoolRepository resSchoolRepository;
    @Autowired
    ResMerchantRepository resMerchantRepository;
    @Autowired
    ResUserRepository resUserRepository;
    @Autowired
    ResOrderRepository resOrderRepository;


    @Override
    public ResSchool findResSchoolByName(String name) {
        return resSchoolRepository.findBySchoolName(name);
    }

    @Override
    public void saveResMerchant(ResMerchant resMerchant) {
        resMerchantRepository.save(resMerchant);
    }

    @Override
    public ResMerchant findResMerchantByName(String name){
        return resMerchantRepository.findByMerchantName(name);
    }

    @Override
    public List<ResUser> findResUserAll() {
        List<ResUser> data = resUserRepository.findAll();
        return data;
    }

    @Override
    public ResUser findResUserByUserId(String userId) {
        ResUser data = resUserRepository.findByUserId(userId);
        logger.info(data.toString());
        return data;
    }

    @Override
    public void saveResUser(ResUser resUser){
        if (!resUserRepository.existsResUserByUserId(resUser.getUserId())){
            resUserRepository.save(resUser);
        }
    }

    @Override
    public void updateResUser(ResUser resUser) {
        if (resUserRepository.existsResUserByUserId(resUser.getUserId())){
            logger.info(resUser.toString());
            resUserRepository.save(resUser);
        }
    }

    @Override
    public List<ResOrder> findOrderByNoVa(String noVa) {
        System.out.println(resOrderRepository.findByNoVa(noVa).toString());
        return resOrderRepository.findByNoVa(noVa);
    }

    @Override
    public void saveResOrder(ResOrder resOrder) {
        resOrderRepository.save(resOrder);
    }


}
