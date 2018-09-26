package com.lei.music.dao.musicweb;

import com.lei.music.entity.musicweb.Notice;

import java.util.List;

public interface NoticeDao {

    List<Notice> queryNotices();
    int saveNotice(Notice notice);
    int removeNotice(Integer id);
    int updateNotice(Notice notice);
}
