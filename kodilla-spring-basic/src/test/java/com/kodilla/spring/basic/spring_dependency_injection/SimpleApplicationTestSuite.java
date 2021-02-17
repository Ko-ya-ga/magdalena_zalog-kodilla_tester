package com.kodilla.spring.basic.spring_dependency_injection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class SimpleApplicationTestSuite {
    @Test
    public void shouldReturnCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        // Pobierany jest kontekst Springowy. Konieczne jest wskazanie nazwy pakietu – pomaga to określić zasięg skanowania.
        SkypeMessageService bean = context.getBean(SkypeMessageService.class);
        // Szukanie beana określonego typu. Po nazwie klasy trzeba dodać .class - w ten sposób przekazuje się oczekiwany typ.
        String message = bean.send("Test", "Any receiver");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldProcessMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        SimpleApplication bean = context.getBean(SimpleApplication.class);
        String message = bean.processMessage("Test", "Any receiver");
        Assertions.assertEquals("Sending [Test] to: Any receiver using Skype", message);
    }
}