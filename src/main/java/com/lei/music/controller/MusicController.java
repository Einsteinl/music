package com.lei.music.controller;

import com.lei.music.dao.musicweb.MusicDao;
import com.lei.music.entity.musicweb.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("music")
public class MusicController {

    @Autowired
    MusicDao musicDao;

    @GetMapping
    public List<Music> findAllmusic(){
        System.out.println("---------------"+musicDao.queryMusics().toString());
        return musicDao.queryMusics();

    }

    @PostMapping
    public Music addMusic(@RequestBody Music music){

        musicDao.saveMusic(music);

        return music;

    }

    @DeleteMapping("/{id}")
    public int deleteMusic(@PathVariable Integer id){

        return musicDao.removeMusicById(id);

    }

    @PostMapping("/{id}")
    public int updateMusic(@RequestBody Music music,@PathVariable Integer id){

        return musicDao.updateMusic(music);
    }

}
