package com.covid.bean;

import java.util.Date;

public class confirm {
    private Date ObservationDate;
    private Integer Confirmed;

    public Date getObservationDate() {
        return ObservationDate;
    }

    public Integer getCases() {
        return Confirmed;
    }

    public void setObservationDate(Date observationDate) {
        ObservationDate = observationDate;
    }

    public void setCases(Integer cases) {
        this.Confirmed = cases;
    }
}

