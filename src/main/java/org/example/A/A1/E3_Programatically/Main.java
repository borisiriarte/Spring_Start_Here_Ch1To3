package org.example.A.A1.E3_Programatically;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
  public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Parrot x = new Parrot();
    x.setName("Carla");

    Parrot y = new Parrot();
    y.setName("Brenda");

    Supplier<Parrot> parrotSupplier = () -> x;
    Supplier<Parrot> parrotSupplier1 = () -> y;
    ctx.registerBean("p1", Parrot.class, parrotSupplier);
    ctx.registerBean("p2", Parrot.class, parrotSupplier1, bx -> bx.setPrimary(true));

    Parrot p = ctx.getBean(Parrot.class);

    System.out.println(p.getName());
  }
}
