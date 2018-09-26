package com.lei.music.dao.musictop;

import com.lei.music.entity.musictop.Top;

import java.util.List;

public interface oldtopDao {
    List<Top> queryoldTops();
    Top saveoldTop();
    int removeoldTop();
    int updateoldTop();
}
