package org.acme.schooltimetabling.persistence;

import javax.enterprise.context.ApplicationScoped;

import org.acme.schooltimetabling.domain.Subject;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class SubjectRepository implements PanacheRepository<Subject> {

}
