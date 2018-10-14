package com.teamtreehouse.contactmgr;

import com.teamtreehouse.contactmgr.model.Contact;
import com.teamtreehouse.contactmgr.model.Contact.ContactBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;


public class Application {

    //Hold a reusable session factory

    // private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        //create a StandardServiceRegistry

        final ServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        return new MetadataSources(registry).buildMetadata().buildSessionFactory();

    }


    public static void main(String[] args) {

        // Contact contact new Contact("James","Watson","jm@gmail.com",512789521L);
        Contact contact = new ContactBuilder("James", "watson")
                .withEmail("abc@hmail.vom")
                .withPhone(456789412L)
                .build();

        System.out.println(contact);
    }
}
