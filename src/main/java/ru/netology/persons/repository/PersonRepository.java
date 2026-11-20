package ru.netology.persons.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.persons.model.Person;

@Repository
public class PersonRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery(
                        "select p from Person p where lower(p.cityOfLiving) = lower(:city)", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
