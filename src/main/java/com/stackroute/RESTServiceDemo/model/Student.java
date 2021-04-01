package com.stackroute.RESTServiceDemo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student {
    @Id
    private int stdId;
    private String stdName;
    private String stdEmail;

    public Student() {
    }

    public Student(int stdId, String stdName, String stdEmail) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdEmail = stdEmail;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdEmail() {
        return stdEmail;
    }

    public void setStdEmail(String stdEmail) {
        this.stdEmail = stdEmail;
    }
}
