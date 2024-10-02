package com.natwest;

import com.natwest.example.Restraunt;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        To better understand the process, let's break it down:
//
//        1. **ApplicationContext**: This interface represents the Spring IoC container and is responsible for instantiating, configuring, and assembling beans.
//
//        2. **ClassPathXmlApplicationContext**: This implementation of the ApplicationContext interface loads context definitions from XML files located in the classpath, treating context definitions as classpath resources.
//
//        3. **"object.xml"**: This is the XML configuration file that contains bean definitions. In this file, beans are configured along with their dependencies and properties.
//
//        4. **applicationContext.getBean("emp")**: This line retrieves the bean named "emp" from the ApplicationContext. The bean named "emp" is expected to be defined in the "object.xml" configuration file.
//
//        5. **Employee**: Assuming "Employee" is a class representing an employee entity in your application.
//
//        Overall, this code snippet initializes the Spring IoC container with bean definitions from the "object.xml" file, retrieves an instance of the "Employee" bean, and casts it to the appropriate type for further use.
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("objects.xml");
//        Empoyee empoyee=(Empoyee) applicationContext.getBean("emp");
//        empoyee.setName("Riti");
//        System.out.println(empoyee.getName());
////        ApplicationContext applicationContext1=new ClassPathXmlApplicationContext("objects.xml");
//
//
//        Restraunt restraunt=(Restraunt) applicationContext.getBean("rest");
//        System.out.println(restraunt.getName());

        Restraunt restraunt1=(Restraunt) applicationContext.getBean("rest1");
        System.out.println(restraunt1.getName());
        System.out.println(restraunt1.getAddress());
        System.out.println(restraunt1.getClass());

        Restraunt restraunt2=(Restraunt) applicationContext.getBean("rest2");
        System.out.println(restraunt2.getName());
        System.out.println(restraunt2.getAddress());
    }
}