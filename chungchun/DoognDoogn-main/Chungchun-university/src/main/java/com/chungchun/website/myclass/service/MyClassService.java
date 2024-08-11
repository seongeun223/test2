package com.chungchun.website.myclass.service;

import com.chungchun.website.myclass.model.MyClass;
import com.chungchun.website.myclass.model.MyClassDTO;
import com.chungchun.website.myclass.repository.MyClassRepository;
import com.chungchun.website.user.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional( readOnly = true)
public class MyClassService {

    private final MyClassRepository myClassRepository;

    public List<MyClass> findAllByUser(User user) {

        log.info("으어");
        List<MyClass> myClassList= myClassRepository.findMyClassesByUser(user);
        log.info("어디가 문제야...");
        return myClassList;
    }



}
