package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.example") // 1) It specifies from which package the bean needs to be created. In other words, we need to specify the package from which Spring should read to identify the beans.
                                             // 2) Whatever component is present inside (org.example) is considered a bean (and will be injected into the system).

@PropertySource("classpath:application.properties") // Telling Spring that for whatever properties you want to read, read them from this file.
public class AnnotationBeanConfig {
// Here, you do not need to declare the bean because Spring will create the beans for you and automatically inject them on your behalf.
}
