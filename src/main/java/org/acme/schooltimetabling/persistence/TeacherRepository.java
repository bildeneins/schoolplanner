package org.acme.schooltimetabling.persistence;

import javax.enterprise.context.ApplicationScoped;

import org.acme.schooltimetabling.domain.Teacher;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class TeacherRepository implements PanacheRepository<Teacher> {

}
