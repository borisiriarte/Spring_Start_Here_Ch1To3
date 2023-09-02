package org.example.A.A2.E4_CircularDependencies;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.A2_04_Example_CircularDependencies")
public class ProjectConfig {
}
