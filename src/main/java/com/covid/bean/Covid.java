package com.covid.bean;

import lombok.Data;

@Data
public class Covid {
    private String country;
    private int newConfirmed;
    private int totalConfirmed;
    private int newDeaths;
    private int totalDeaths;
    private int newRecovered;
    private int totalRecovered;
}
