package com.ash;

        import com.ash.entity.Person;
        import com.ash.entity.PhoneNumber;
        import com.ash.jpa.PersonDao;
        import com.ash.util.HibernateUtil;
        import org.hibernate.Session;

public class TestMain {
    public static void main(String[] args) {


        System.out.println("Getting Person");

        PersonDao personDao = new PersonDao();
        Person storedPerson=  personDao.getPerson(1);
        System.out.println(storedPerson);
    }

    private void insert()
    {
        Person person = new Person();
        person.setPerson_id(1);
        person.setName("testperson");

        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setPhone_number(123);
        phoneNumber.setPhone_number_id(1);

        phoneNumber.setPerson(person);

       // person.getPhoneNumber().add(phoneNumber);

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();

        System.out.println("Done adding a person");

    }
}