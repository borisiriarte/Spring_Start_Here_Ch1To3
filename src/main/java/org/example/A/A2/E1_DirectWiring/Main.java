package org.example.A.A2.E1_DirectWiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Person person = ctx.getBean(Person.class);
    Parrot parrot = ctx.getBean(Parrot.class);

    System.out.println("Person's name: " + person.getName());
    System.out.println("Parrot's name: " + parrot.getName());
    System.out.println("Person's parrot: " + person.getParrot());
  }
}
