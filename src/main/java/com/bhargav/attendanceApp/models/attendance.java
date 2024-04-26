package com.bhargav.attendanceApp.models;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name="attendance")
public class attendance {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String regno ;

    private String name;
    private Date date_of_attendance;
    private String present;
    
    public String getRegno() {
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDate_of_attendance() {
        return date_of_attendance;
    }
    public void setDate_of_attendance(Date date_of_attendance) {
        this.date_of_attendance = date_of_attendance;
    }
    public String getPresent() {
        return present;
    }
    public void setPresent(String present) {
        this.present = present;
    }
    
    
}
