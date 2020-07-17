package com.covid.bean;

import java.util.Calendar;
import java.util.Date;

public class chart {
    private Integer y;
    private Integer year;
    private Integer mouth;
    private Integer day;


    public chart(confirm confirm) {
        y =confirm.getCases();
        Calendar c= Calendar.getInstance();

        c.setTime(confirm.getObservationDate());
        year=c.get(Calendar.YEAR);
        mouth=c.get(Calendar.MONTH);
        day=c.get(Calendar.DAY_OF_MONTH);
    }

    public void setY(Integer y) {
        this.y = y;
    }


    public Integer getY() {
        return y;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setMouth(Integer mouth) {
        this.mouth = mouth;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getMouth() {
        return mouth;
    }

    public Integer getDay() {
        return day;
    }
}
