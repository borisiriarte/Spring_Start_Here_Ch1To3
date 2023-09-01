package org.example.A2_02_Example_WiringByParameter;

import org.example.A2_01_Example_DirectWiring.Parrot;
import org.example.A2_01_Example_DirectWiring.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);

    org.example.A2_01_Example_DirectWiring.Person person = ctx.getBean(Person.class);
    org.example.A2_01_Example_DirectWiring.Parrot parrot = ctx.getBean(Parrot.class);

    System.out.println("Person's name: " + person.getName());
    System.out.println("Parrot's name: " + parrot.getName());
    System.out.println("Person's parrot: " + person.getParrot());
  }
}
