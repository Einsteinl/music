package com.lei.music.dao.musictop;

import com.lei.music.entity.musictop.Top;

import java.util.List;

public interface newtopDao {
    List<Top> querynewTops();
    Top savenewTop();
    int removenewTop();
    int updatenewTop();
}
