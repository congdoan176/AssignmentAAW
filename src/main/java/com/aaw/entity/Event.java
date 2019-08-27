package com.aaw.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Event {
    @Id
    private int id;
    private String dayEvent;
    private String timeEvent;
    private String planning;
    private String place;
    private String info;

    public Event() {
    }

    public Event(int id, String dayEvent, String timeEvent, String planning, String place, String info) {
        this.id = id;
        this.dayEvent = dayEvent;
        this.timeEvent = timeEvent;
        this.planning = planning;
        this.place = place;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public Event setId(int id) {
        this.id = id;
        return this;
    }

    public String getDayEvent() {
        return dayEvent;
    }

    public Event setDayEvent(String dayEvent) {
        this.dayEvent = dayEvent;
        return this;
    }

    public String getTimeEvent() {
        return timeEvent;
    }

    public Event setTimeEvent(String timeEvent) {
        this.timeEvent = timeEvent;
        return this;
    }

    public String getPlanning() {
        return planning;
    }

    public Event setPlanning(String planning) {
        this.planning = planning;
        return this;
    }

    public String getPlace() {
        return place;
    }

    public Event setPlace(String place) {
        this.place = place;
        return this;
    }

    public String getInfo() {
        return info;
    }

    public Event setInfo(String info) {
        this.info = info;
        return this;
    }
}
