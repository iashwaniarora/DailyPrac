package com.ash.jpa;

import com.ash.entity.Person;
import com.ash.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

public class PersonDao {

    @Transactional
    public Person getPerson(int id)
    {
        Session currentSession = HibernateUtil.getSessionFactory().openSession();
        return (Person) currentSession.createCriteria(Person.class).add(Restrictions.idEq(id)).uniqueResult();
    }
}
