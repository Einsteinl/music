package com.lei.music.dao.musicweb;

import com.lei.music.entity.musicweb.Music;

import java.util.List;

public interface MusicDao {

    List<Music> queryMusics();
    int saveMusic(Music music);
    int removeMusicById(Integer id);
    int updateMusic(Music music);
}
