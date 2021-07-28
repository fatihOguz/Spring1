package com.foguz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args){

/**
        Employee employee = new Employee();

        employee.setEid(101);
        employee.setName("Fatih");
        employee.seteSalary(3000);

        System.out.println(employee);
*/
        /**
         * Inversion of control (IOC)
         * 1-) Add jar files for spring core
         * 2-) Configure java object in an XML file
         * 3-) Use Spring IOC Container : eg: BeanFactory or Application Context to get the objects constructed by them
         */

        ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
        Employee employee1 = (Employee) context.getBean("employee1");
        Employee employee2 = context.getBean("employee2",Employee.class);


        System.out.println("------------Spring IOC in action------------------");
        System.out.println(employee1);
        System.out.println(employee2);
        ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
        ctx.close();

    }
}
