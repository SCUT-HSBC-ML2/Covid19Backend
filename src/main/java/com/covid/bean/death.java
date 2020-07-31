package com.covid.bean;

import java.util.Date;

public class death {
    private Date ObservationDate;
    private Integer Deaths;

    public Date getObservationDate() {
        return ObservationDate;
    }

    public Integer getCases() {
        return Deaths;
    }

    public void setObservationDate(Date observationDate) {
        ObservationDate = observationDate;
    }

    public void setCases(Integer cases) {
        this.Deaths = cases;
    }
}

