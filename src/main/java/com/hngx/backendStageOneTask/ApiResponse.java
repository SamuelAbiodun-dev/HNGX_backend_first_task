package com.hngx.backendStageOneTask;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {
    private String slackName;
    private String currentDay;
    private String utcTime;
    private String track;
    private String githubFileUrl;
    private String githubRepoUrl;
    private int statusCode;
}
