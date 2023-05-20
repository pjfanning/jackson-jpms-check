package com.fasterxml.jackson.jpms;

public class Bean {
    private String id;

    public Bean(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
