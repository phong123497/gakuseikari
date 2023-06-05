/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gakusei.kanri;

import java.io.Serializable;

/**
 *
 * @author phong
 */
public class Student implements Serializable {
    private int id;
    private String name;
    private byte age;
    private String address;
    /* điểm trung bình của sinh viên */
    private float gpa;
 
    public Student() {
    }
 
    public Student(int id, String name, byte age, 
            String address, float gpa) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }
 
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
 
    public byte getAge() {
        return age;
    }
 
    public void setAge(byte age) {
        this.age = age;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public float getGpa() {
        return gpa;
    }
 
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}  
