package com.ash;

        import com.ash.entity.Person;
        import com.ash.util.HibernateUtil;
        import org.hibernate.Session;

public class TestMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(1);
        person.setName("Concretepage");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();
        System.out.println("Done");
    }
}