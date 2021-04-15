package org.acme.schooltimetabling.rest;

import org.acme.schooltimetabling.domain.Subject;
import org.acme.schooltimetabling.persistence.SubjectRepository;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheRepositoryResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "subjects")
public interface SubjectResource extends PanacheRepositoryResource<SubjectRepository, Subject, Long> {

}
