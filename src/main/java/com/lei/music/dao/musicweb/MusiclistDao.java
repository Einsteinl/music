package com.lei.music.dao.musicweb;

import com.lei.music.entity.musicweb.Musiclist;

import java.util.List;

public interface MusiclistDao {

    List<Musiclist> queryMusiclists();
    int saveMusiclist(Musiclist musiclist);
    int removeMusiclist(Integer id);
    int updateMusiclist(Musiclist musiclist);
}
