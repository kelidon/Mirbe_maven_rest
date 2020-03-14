package com.kelidon;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {

    private static final String template = "Sounds like shit, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/mirbe")
    public Song greeting(@RequestParam(value = "name", defaultValue = "o hi Mark") String name) {
        return new Song(counter.incrementAndGet(), String.format(template, name));
    }
}