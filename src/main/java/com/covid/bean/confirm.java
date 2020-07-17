package com.covid.bean;

import java.util.Date;

public class confirm {
    private Date ObservationDate;
    private Integer cases;

    public Date getObservationDate() {
        return ObservationDate;
    }

    public Integer getCases() {
        return cases;
    }

    public void setObservationDate(Date observationDate) {
        ObservationDate = observationDate;
    }

    public void setCases(Integer cases) {
        this.cases = cases;
    }
}

