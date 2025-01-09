package com.devleofulco.life_music.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Music {
    private String title;
    private String artist;
    private String album;
    private String url;
    private String platform;
    private Long duration;
}
