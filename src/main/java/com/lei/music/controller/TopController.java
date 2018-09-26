package com.lei.music.controller;

import com.lei.music.dao.musictop.*;
import com.lei.music.entity.musictop.Top;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("top")
public class TopController {
    @Autowired
    hottopDao hottopdao;
    @Autowired
    fashiontopDao fashiontopdao;
    @Autowired
    nettopDao nettopdao;
    @Autowired
    newtopDao newtopdao;
    @Autowired
    oldtopDao oldtopdao;
    @Autowired
    origintopDao origintopdao;

    @GetMapping("/fashion")
    public List<Top> findAllfashionTop(){

        return fashiontopdao.queryfashionTops();
    }
    @GetMapping("/net")
    public List<Top> findAllnetTop(){

        return nettopdao.querynetTops();
    }
    @GetMapping("/hot")
    public List<Top> findAllhotTop(){

        return hottopdao.queryhotTops();
    }
    @GetMapping("/new")
    public List<Top> findAllnewTop(){

        return newtopdao.querynewTops();
    }
    @GetMapping("/old")
    public List<Top> findAlloldTop(){

        return oldtopdao.queryoldTops();
    }
    @GetMapping("/origin")
    public List<Top> findAlloriginTop(){

        return origintopdao.queryoriginTops();
    }
}
