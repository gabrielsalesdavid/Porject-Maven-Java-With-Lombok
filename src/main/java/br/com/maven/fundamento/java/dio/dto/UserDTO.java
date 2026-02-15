package br.com.maven.fundamento.java.dio.dto;

import java.time.LocalDate;

public class UserDTO {

    private int id;
    private String name;
    private LocalDate birthDay;

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "UserDTO(" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", birthDay=" + birthDay +
            ')';
    }
}
