package com.lei.music.controller;

import com.lei.music.dao.musicweb.NoticeDao;
import com.lei.music.entity.musicweb.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("notice")
public class NoticeController {

    @Autowired
    NoticeDao noticeDao;

    @GetMapping
    public List<Notice> findAllnotice(){

        return noticeDao.queryNotices();
    }
    @PostMapping
    public Notice addNotice(@RequestBody Notice notice){

        noticeDao.saveNotice(notice);
        return notice;

    }
    @DeleteMapping("/{id}")
    public int deleteNotice(@PathVariable Integer id){

        return noticeDao.removeNotice(id);
    }
    @PostMapping("/{id}")
    public int updateNotice(@PathVariable Integer id,@RequestBody Notice notice){

        return noticeDao.updateNotice(notice);
    }
}
