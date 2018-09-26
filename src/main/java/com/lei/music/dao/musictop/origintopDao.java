package com.lei.music.dao.musictop;

import com.lei.music.entity.musictop.Top;

import java.util.List;

public interface origintopDao {
    List<Top> queryoriginTops();
    Top saveoriginTop();
    int removeoriginTop();
    int updateoriginTop();
}
