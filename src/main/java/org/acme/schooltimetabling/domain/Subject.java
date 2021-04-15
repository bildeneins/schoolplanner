package org.acme.schooltimetabling.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Subject {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Subject(String name) {
        this.name = name;
    }

    public Subject(Long id, String name) {
        this(name);
        this.id = id;
    }

    public Subject() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
