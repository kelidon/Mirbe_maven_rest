package com.kelidon;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {

    @GetMapping("/mirbe")
    public Song song(
            @RequestParam(name="name", required=false, defaultValue="World")
                    String name) {

        return new Song(1, name, "mark");
    }
}