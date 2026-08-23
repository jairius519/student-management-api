package com.burks.students;
import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String degree;
    private String major;

    public String getName() {
        return name;
    }

    public String getDegree() {
        return degree;
    }

    public String getMajor() {
        return major;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}
