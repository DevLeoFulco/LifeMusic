package com.devleofulco.life_music.entrypoint.rest.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserRequest implements Serializable {
    private String username;
    private String email;
}
