package com.lei.music.controller;

import com.lei.music.dao.musicweb.UserDao;
import com.lei.music.entity.musicweb.memBer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    UserDao userDao;

    @GetMapping
    public List<memBer> getmembers(){
//
//        System.out.println("1");
//        System.out.println("1");
//        System.out.println("1");
//        System.out.println("1");
//        System.out.println("1");
//        System.out.println("1");
//        System.out.println("000000000000000000000000"+userDao.queryMembers().toString());
        return userDao.queryMembers();
    }
    @PostMapping
    public memBer savemember(@RequestBody memBer member){

        userDao.saveMember(member);

        return member;

    }

    @DeleteMapping("/{id}")
    public int removemember(@PathVariable("id") Integer id){

        return userDao.removeMember(id);

    }
    @PostMapping("/{id}")
    public int updatemember(@PathVariable("id") Integer id,@RequestBody memBer member){

        return userDao.updateMember(member);


    }
}
