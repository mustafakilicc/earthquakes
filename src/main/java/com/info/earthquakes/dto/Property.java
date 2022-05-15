package com.info.earthquakes.dto;

import java.util.Date;

public class Property {
    public Date time;

    public Double mag;

    public String title;

    public String country;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getMag() {
        return mag;
    }

    public void setMag(Double mag) {
        this.mag = mag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        String[] parseTitle=title.split(",");
        return this.country = parseTitle[parseTitle.length-1];
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
