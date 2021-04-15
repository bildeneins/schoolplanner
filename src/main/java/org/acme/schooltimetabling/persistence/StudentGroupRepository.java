package org.acme.schooltimetabling.persistence;

import javax.enterprise.context.ApplicationScoped;

import org.acme.schooltimetabling.domain.StudentGroup;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class StudentGroupRepository implements PanacheRepository<StudentGroup> {

}
