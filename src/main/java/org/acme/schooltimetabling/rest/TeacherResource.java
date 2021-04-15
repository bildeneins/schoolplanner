package org.acme.schooltimetabling.rest;

import org.acme.schooltimetabling.domain.Teacher;
import org.acme.schooltimetabling.persistence.TeacherRepository;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "teachers")
public interface TeacherResource extends PanacheRepositoryResource<TeacherRepository, Teacher, Long> {

}
