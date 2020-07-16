package com.example.bazar_setu.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity(name = "slot_info")
public class Slot {

    @Id
    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "date")
    private Date date;

    @Column(name = "duration_of_slots")
    private Time durationOfSlots;

    @Column(name = "max_num_of_customers")
    private Integer maxNumberOfCustomer;

    @Column(name = "start_time")
    private Time startTime;

    @Column(name = "end_time")
    private Time endTime;

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getDurationOfSlots() {
        return durationOfSlots;
    }

    public void setDurationOfSlots(Time durationOfSlots) {
        this.durationOfSlots = durationOfSlots;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Integer getMaxNumberOfCustomer() {
        return maxNumberOfCustomer;
    }

    public void setMaxNumberOfCustomer(Integer maxNumberOfCustomer) {
        this.maxNumberOfCustomer = maxNumberOfCustomer;
    }
}
