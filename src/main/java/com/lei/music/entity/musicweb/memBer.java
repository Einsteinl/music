package com.lei.music.entity.musicweb;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
public class memBer {
    private Integer id;
    private String username;
    private String name;
    private String pwd;
    private String email;
    private String tel;
    private String date;


}
