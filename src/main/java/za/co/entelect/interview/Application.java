package za.co.entelect.interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import za.co.entelect.interview.java.questions.Question2.EqualsAndHashcode;
import za.co.entelect.interview.java.questions.Question5.StringEqualsAndPool;

@SpringBootApplication(scanBasePackages = {"za.co.entelect.interview.java.questions",
        "za.co.entelect.interview.spring.questions"})
public class Application implements CommandLineRunner {

    @Autowired
    private EqualsAndHashcode equalsAndHashcode;

    @Autowired
    private StringEqualsAndPool stringEqualsAndPool;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        equalsAndHashcode.isObjectsEqual();

        equalsAndHashcode.isHashCodeEqual();

        stringEqualsAndPool.compareTwoStrings();
    }
}
