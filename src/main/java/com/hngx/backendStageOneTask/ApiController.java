package com.hngx.backendStageOneTask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping()
    public ApiResponse getExampleApiResponse(@RequestParam String slack_name, @RequestParam String track) {
        ApiResponse response = new ApiResponse();
        response.setSlackName(slack_name);
        response.setCurrentDay(LocalDateTime.now().getDayOfWeek().toString());
        response.setUtcTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        response.setTrack(track);
        response.setGithubFileUrl("https://github.com/SamuelAbiodun-dev/HNGX_backend_first_task/blob/main/src/main/java/com/hngx/backendStageOneTask/ApiController.java");
        response.setGithubRepoUrl("https://github.com/SamuelAbiodun-dev/HNGX_backend_first_task");
        response.setStatusCode(200);
        return response;
    }
}



