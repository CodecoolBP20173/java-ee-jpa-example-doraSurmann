package com.codecool.jpaexample.model;

import com.sun.deploy.security.ValidationState;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Klass {
    private String name;

    @OneToMany
    private Set<Student> students = new HashSet<>();

    public Klass() {}

    public Klass(String name, CCLocation location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(value = EnumType.STRING)
    private CCLocation location;

}

/* Create a new enumerated class called CCLocation with values MISKOLC, BUDAPEST,
and KRAKOW! Add it as an attribute to Klass and set it in its constructor!
How does it get represented in the database? Use the @Enumerated annotation to
change this default behaviour!
 */
