package com.kclm.servlet.entity;

import java.time.LocalDate;
import java.util.Objects;

public class employee {
    private Integer id;
    private String name;
    private LocalDate birthday;
    private String gender;
    private String tel;

    public employee() {
    }

    public employee(Integer id, String name, LocalDate birthday, String gender, String tel) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.tel = tel;
    }

    public employee(String name, LocalDate birthday, String gender, String tel) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employee employee = (employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(name, employee.name) &&
                Objects.equals(birthday, employee.birthday) &&
                Objects.equals(gender, employee.gender) &&
                Objects.equals(tel, employee.tel);
    }


    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
