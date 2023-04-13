package com.example.JPABasic;

import jakarta.persistence.*;

@Entity
@Table(name="user_info")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private int id;
    @Column(name = "userName")
    private String name;
    @Column(name = "mobileNo")
    private String mobile;
    @Column(name = "userAge")
    private int age;
    @OneToOne(mappedBy = "user")
    private Card card;


    public User(){}
    public User(int id, String name, String mobile, int age) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.age = age;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
