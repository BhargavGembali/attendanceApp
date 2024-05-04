package com.bhargav.attendanceApp.models;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name="student")
public class attendance {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    private String name;
    private Date dateofattendance;
    private String status;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDateofattendance() {
        return dateofattendance;
    }
    public void setDateofattendance(Date dateofattendance) {
        this.dateofattendance = dateofattendance;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
