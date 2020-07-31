package com.covid.bean;

import java.util.Date;

public class cure {
    private Date ObservationDate;
    private Integer Recovered;

    public Date getObservationDate() {
        return ObservationDate;
    }

    public Integer getCases() {
        return Recovered;
    }

    public void setObservationDate(Date observationDate) {
        ObservationDate = observationDate;
    }

    public void setCases(Integer cases) {
        this.Recovered = cases;
    }
}

