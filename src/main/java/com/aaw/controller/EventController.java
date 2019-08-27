package com.aaw.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.aaw.entity.Event;
import com.opensymphony.xwork2.ActionSupport;

public class EventController extends ActionSupport{
	private static List<Event> eventList = new ArrayList<Event>();

    public List<Event> getEventList() {
        return eventList;
    }
    static long editId = 0;

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    private Event newEvent ;

    public Event getNewEvent() {
        return newEvent;
    }

    public void setNewEvent(Event newEvent) {
        this.newEvent = newEvent;
    }

    public String NewEvent(){
        this.newEvent = new Event();
        return SUCCESS;
    }
    public String DeleteEvent(){

        Iterator it =  eventList.iterator();
        while (it.hasNext()){
            Event ev = (Event)it.next();
            if (ev.getId() == this.newEvent.getId()){
                System.out.println(this.newEvent.getId());
                it.remove();
                break;
            }
        }
        return SUCCESS;
    }
    public String store(){
        if(editId != 0){
            for (int i = 0 ; i< eventList.size() ; i++){
                if (eventList.get(i).getId() == editId){
                    this.newEvent.setId(editId);
                    eventList.set(i,this.newEvent);
                    editId = 0;
                    break;
                }
            }
            return SUCCESS;
        }
        if (this.newEvent != null){
            eventList.add(this.newEvent);

        }
//        this.newEvent = new Event();
        return SUCCESS;
    }
    public String edit(){
        editId = this.newEvent.getId();
        System.out.println(this.newEvent.getId());
        return SUCCESS;
    }
    @Override
    public void validate() {
        if (this.newEvent == null) {
            return;
        }
        if (this.newEvent.getDayEvent()== null
                || this.newEvent.getDayEvent().trim().length() == 0
                ) {
            addFieldError("newEvent.date", "date is required!");
        }
        if (this.newEvent.getInfo()== null  || this.newEvent.getInfo().trim().length() == 0){
            addFieldError("newEvent.info", "info is required!");
        }
        if (this.newEvent.getPlanning()== null  || this.newEvent.getPlanning().trim().length() == 0){
            addFieldError("newEvent.plan", "plan is required!");
        }
        if (this.newEvent.getTimeEvent()== null  || this.newEvent.getTimeEvent().trim().length() == 0){
            addFieldError("newEvent.time", "time is required!");
        }
        if (this.newEvent.getPlace()== null  || this.newEvent.getPlace().trim().length() == 0){
            addFieldError("newEvent.location", "location is required!");
        }
    }
}
