package com.hngx.backendStageOneTask;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ApiResponse {
    @JsonProperty
    private String slack_name;
    @JsonProperty
    private String current_day;
    @JsonProperty
    private String utc_time;
    @JsonProperty
    private String track;
    @JsonProperty
    private String github_file_url;
    @JsonProperty
    private String github_repo_url;
    @JsonProperty
    private int status_code;
}
