package com.lei.music.controller;

import com.lei.music.dao.musicweb.MusiclistDao;
import com.lei.music.entity.musicweb.Musiclist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("musiclist")
public class MusiclistController {
    @Autowired
    MusiclistDao musiclistDao;

    @GetMapping
    public List<Musiclist> findAllmusiclist(){

        System.out.println("---------------------------------------------");

        return musiclistDao.queryMusiclists();
    }

    @PostMapping
    public Musiclist addMusiclist(@RequestBody Musiclist musiclist){

        musiclistDao.saveMusiclist(musiclist);

        return musiclist;

    }

    @DeleteMapping("/{id}")
    public int deleteMusiclist(@PathVariable Integer id){

        return musiclistDao.removeMusiclist(id);
    }

    @PostMapping("/{id}")
    public int updateMusiclist(@PathVariable Integer id,@RequestBody Musiclist musiclist){

        return musiclistDao.updateMusiclist(musiclist);
    }
}
