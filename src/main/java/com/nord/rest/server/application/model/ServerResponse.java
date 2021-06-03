package com.nord.rest.server.application.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ServerResponse {

    @JsonProperty
    private int id;

    @JsonProperty
    private String content;

}
