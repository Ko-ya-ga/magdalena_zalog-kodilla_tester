package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");

    @Test
    public void shouldReturnSuccessMessage() {
        PostOfficeNotificationService bean = context.getBean(PostOfficeNotificationService.class);
        String message = bean.success("Hill Street 11, New York");
        Assertions.assertEquals("Package delivered to: Hill Street 11, New York by post office", message);
    }

    @Test
    public void shouldReturnFailMessage() {
        PostOfficeNotificationService bean = context.getBean(PostOfficeNotificationService.class);
        String message = bean.fail("Hill Street 11, New York");
        Assertions.assertEquals("Package not delivered to: Hill Street 11, New York", message);
    }

    @Test
    public void testSendPackage() {
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Hill Street 11, New York", 18.2);
        Assertions.assertEquals("Package delivered to: Hill Street 11, New York by post office", message);

    }
}