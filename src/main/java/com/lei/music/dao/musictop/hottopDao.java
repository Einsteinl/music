package com.lei.music.dao.musictop;

import com.lei.music.entity.musictop.Top;

import java.util.List;

public interface hottopDao {
    List<Top> queryhotTops();
    Top savehotTop();
    int removehotTop();
    int updatehotTop();
}
