package com.kelidon;

public class Song {

    private final long id;
    private final String response;

    public Song(long id, String response) {
        this.id = id;
        this.response = response;
    }

    public long getId() {
        return id;
    }

    public String getResponse() {
        return response;
    }
}
