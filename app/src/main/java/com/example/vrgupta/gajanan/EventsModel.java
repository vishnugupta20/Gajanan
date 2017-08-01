package com.example.vrgupta.gajanan;

/**
 * Created by vrgupta on 24/07/17.
 */

public class EventsModel {

    private String title, subtitle, timing;

    public EventsModel() {
    }

    public EventsModel(String title, String subtitle, String timing) {
        this.title = title;
        this.subtitle = subtitle;
        this.timing = timing;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
