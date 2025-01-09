package com.devleofulco.life_music.entrypoint.rest.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class UserResponse implements Serializable {
    private Long id;
    private String username;
    private String email;
    private List<PlaylistResponse> playlists;
}
