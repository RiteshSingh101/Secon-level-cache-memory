package com.mca.curd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mca.entity.Car;

public class Fetch {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("rit");

        // FIRST ENTITY MANAGER
        EntityManager em1 = emf.createEntityManager();

        Car c1 = em1.find(Car.class, 1);

        System.out.println(c1.getCname());

        em1.close();

        System.out.println("----------------");

        // SECOND ENTITY MANAGER
        EntityManager em2 = emf.createEntityManager();

        Car c2 = em2.find(Car.class, 1);

        System.out.println(c2.getCname());

        em2.close();
    }
}