package org.example.A.A2.E5_InBtwnMultipleBeans.E1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Person person = ctx.getBean(Person.class);

    System.out.println("Person's name: " + person.getName());
    System.out.println("Person's parrot: " + person.getParrot());
  }
}
