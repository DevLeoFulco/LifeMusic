package com.devleofulco.life_music.entrypoint.rest.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class PlaylistResponse implements Serializable {
    private Long id;
    private String name;
    private String context;
    private List<MusicResponse> musics;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
