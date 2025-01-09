package com.devleofulco.life_music.entrypoint.rest.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MusicResponse implements Serializable {
    private String title;
    private String artist;
    private String album;
    private String url;
    private String platform;
    private Long duration;
}
