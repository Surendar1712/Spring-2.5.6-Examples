package com.autowire.demo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.autowire.by.constructor.demo.beans.EmployeeBean;

public class AutowireByConstructorArg {

  public static void main(String[] args) {
    // For single context file we can pass directly like this
    ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("xml/applicationContextByConstructor.xml");
    // For passing multiple context files we can pass the files inside the String
    // array like below
    // ApplicationContext appContext = new ClassPathXmlApplicationContext(new
    // String[] { "applicationContextByConstructor.xml" });
    EmployeeBean employeeBean = (EmployeeBean) appContext.getBean("employeeBean");
    System.out.println(employeeBean);
    
    appContext.close();
  }
}
