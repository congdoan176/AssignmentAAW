package com.aaw.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Event {
    @Id
    private long id;
    private String dayEvent;
    private String timeEvent;
    private String planning;
    private String place;
    private String info;

    public Event() {
    	this.id = Calendar.getInstance().getTimeInMillis();
    }

    public Event(int id, String dayEvent, String timeEvent, String planning, String place, String info) {
        this.id = id;
        this.dayEvent = dayEvent;
        this.timeEvent = timeEvent;
        this.planning = planning;
        this.place = place;
        this.info = info;
    }
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
