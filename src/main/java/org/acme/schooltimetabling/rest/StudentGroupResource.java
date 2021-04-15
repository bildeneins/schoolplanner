package org.acme.schooltimetabling.rest;

import org.acme.schooltimetabling.domain.StudentGroup;
import org.acme.schooltimetabling.persistence.StudentGroupRepository;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "studentGroups")
public interface StudentGroupResource extends PanacheRepositoryResource<StudentGroupRepository, StudentGroup, Long> {

}
