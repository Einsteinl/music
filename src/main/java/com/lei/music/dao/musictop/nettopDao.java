package com.lei.music.dao.musictop;

import com.lei.music.entity.musictop.Top;

import java.util.List;

public interface nettopDao {
    List<Top> querynetTops();
    Top savenetTop();
    int removenetTop();
    int updatenetTop();
}
