package com.company;

public class Cat {
    private int age;
    private boolean sex;
    private int size;

    public Cat(){}

    public Cat (int age){
        this.age = age;
    }

    public Cat (int age, boolean sex, int size){
        this.age = age;
        this.sex = sex;
        this.size = size;


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



}
