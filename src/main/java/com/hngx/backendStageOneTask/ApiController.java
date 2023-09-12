package com.hngx.backendStageOneTask;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping()
    public ResponseEntity<Object> getExampleApiResponse(@RequestParam String slack_name, @RequestParam String track) {
        try {
            DayOfWeek dayOfWeek = LocalDateTime.now(ZoneId.of("UTC")).getDayOfWeek();
            String currentDay = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
            String utcTime = LocalDateTime.now(ZoneId.of("UTC")).format(formatter);

            String gitHubRepoUrl = "https://github.com/SamuelAbiodun-dev/HNGX_backend_first_task";
            String gitHubFileUrl = "https://github.com/SamuelAbiodun-dev/HNGX_backend_first_task/blob/main/src/main/java/com/hngx/backendStageOneTask/ApiController.java";

            ApiResponse apiResponse = new ApiResponse(
                    slack_name,
                    currentDay,
                    utcTime,
                    track,
                    gitHubFileUrl,
                    gitHubRepoUrl,
                    200);
            return ResponseEntity.ok(apiResponse);
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
        }
    }
}



