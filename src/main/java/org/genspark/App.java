package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    //Use XML to configure the spring container to achieve DI for the above code,
    // later use Java Annotations and Java Configuration methods.
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student);
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Phone: " + student.getPh());
        System.out.println("Address: " + student.getAdd());
    }
}
