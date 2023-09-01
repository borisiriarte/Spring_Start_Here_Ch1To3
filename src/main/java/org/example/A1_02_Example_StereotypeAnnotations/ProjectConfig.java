package org.example.A1_02_Example_StereotypeAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*@ComponentScan(basePackageClasses = Main.class)*/
@ComponentScan(basePackages = "org.example.A1_02_Example_StereotypeAnnotations")
public class ProjectConfig {
}
