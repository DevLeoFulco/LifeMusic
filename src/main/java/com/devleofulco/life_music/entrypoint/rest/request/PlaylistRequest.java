package com.devleofulco.life_music.entrypoint.rest.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PlaylistRequest implements Serializable {
    private String name;
    private String context;
    private Long id;
}
