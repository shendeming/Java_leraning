package com.bjsxt2;

import java.util.Comparator;
import java.util.Objects;

public class Users implements Comparable<Users> {
    private String username;
    private int userage;


    public Users(String username, int userage) {
        this.username = username;
        this.userage = userage;
    }



    public Users(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return userage == users.userage && Objects.equals(username, users.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, userage);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", userage=" + userage +
                '}';
    }

    //定义比较规则
    //正数：大， 负数：小， 0：相等
    @Override
    public int compareTo(Users o) {
        if(this.userage > o.userage){
            return 1;
        }

        if(this.userage == o.getUserage()){
            return this.username.compareTo(o.getUsername());
        }

        return -1;
    }




}
