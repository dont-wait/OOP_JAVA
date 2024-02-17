/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.di.dto;

/**
 *
 * @author Sang
 */

//nhắc đến sv, chỉ cần quan tâm mã số, tên, năm sinh, chuyên ngành, điểm tb
//chính là ABTRACTION
//biểu diễn đc đối tượng này như ngoài đời thực, ta cần Khuôn dđ, hv
//che giấu show ra khi cần thiết -> ENCAPSULATION, gói trọn trong 1 object
public class Student {
    private String id;
    private String name;
    private int yob;
    private double gpa;
    private String major;

    public Student(String id, String name, int yob, double gpa, String major) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
  
    
    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|%2s|\n",
                                        id, name, yob, gpa, major);
    }
}
