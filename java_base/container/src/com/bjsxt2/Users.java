package com.bjsxt2;

import java.util.Objects;

public class Users {
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
}
