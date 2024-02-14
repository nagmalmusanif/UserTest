package com.example.demo1.api.Model;

import org.yaml.snakeyaml.constructor.Construct;

public class User {

    private  int id;
    private String name;
    private  String email;
    private  int age;

    public User (int id ,String name,int age,String email){
        this.id= id;
        this.name=name;
        this.email=email;
        this.age=age;

    }

    public  int getId(){
        return id;
    }
    public  void setId(int id){
        this.id=id;
    }
    public  String getName(){
        return name;
    }
    public  void setName(String name){
        this.name=name;
    }
    public  int getAge(){
        return age;
    }
    public  void setAge(int age){
        this.age=age;
    }
    public  String getEamil(){
        return email;
    }
    public  void setEmail(String email){
        this.email=email;
    }
}
