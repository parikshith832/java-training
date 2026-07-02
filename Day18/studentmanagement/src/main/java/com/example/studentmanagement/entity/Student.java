package com.example.studentmanagement.entity;

import jakarta.persistence.*;
@Entity
@Table(name="student")
//to control the table name and avoid relying on defaults
public class Student {
    @Id
    //to define a unique primary key for each student record
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //to let the database automatically generate ID's ensuring uniqueness
    private Integer id;
    private String name;
    private String usn;
    private String branch;
    private String email;
    private String mobile;
    public Student(){}
    public Student(Integer id, String name,String usn, String branch,String email,String mobile){
        this.id=id;
        this.name=name;
        this.usn=usn;
        this.branch=branch;
        this.email=email;
        this.mobile=mobile;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getUsn(){
        return usn;
    }
    public void setUsn(String usn){
        this.usn=usn;
    }
    public String getBranch(){
        return branch;
    }
    public void setBranch(String branch){
        this.branch=branch;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getMobile(){
        return mobile;
    }
    public void setMobile(String mobile){
        this.mobile=mobile;
    }
}
