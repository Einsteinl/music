package com.lei.music.dao.musicweb;

import com.lei.music.entity.musicweb.memBer;

import java.util.List;

public interface UserDao {
    List<memBer> queryMembers();
    int saveMember(memBer member);
    int updateMember(memBer member);
    int removeMember(Integer id);
}
