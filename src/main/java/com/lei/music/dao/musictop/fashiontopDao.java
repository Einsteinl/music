package com.lei.music.dao.musictop;

import com.lei.music.entity.musictop.Top;

import java.util.List;

public interface fashiontopDao {
    List<Top> queryfashionTops();
    Top savefashionTop();
    int removefashionTop();
    int updatefashionTop();
}
