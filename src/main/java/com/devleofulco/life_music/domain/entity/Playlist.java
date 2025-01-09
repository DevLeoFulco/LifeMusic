package com.devleofulco.life_music.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Playlist {
    private Long id;
    private String name;
    private String context;
    private List<Music> musics;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long userId;

}
