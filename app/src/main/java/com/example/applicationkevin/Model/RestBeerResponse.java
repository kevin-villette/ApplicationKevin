package com.example.applicationkevin.Model;

import java.util.List;

public class RestBeerResponse {

    private int count;
    private String next;
    private List<Beer> results;

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public List<Beer> getResults() {
        return results;
    }
}