package za.co.entelect.interview.java.questions.Question4;

/* A java bean is a reusable software component that follows a specific set of conventions and guidelines.
 *  Java beans are typical used to encapsulate and manage the state and behaviour of a specific object or data structure.  */

import java.io.Serializable;

/* Using the Person class below we demonstrate the conventions needed for a Java bean. */

/*Depicted in example below:
* Public no-argument constructor for instantiation.
* Properties i.e. getName(), setName()
* Implements serializable.
* Applies to naming standards/conventions.
* */
public class Person implements Serializable {

/*
    Class implements serializable meaning the class can be converted to a stream of bytes and saved to a file or transmitted
    over the network.
*/

    private String name;
    private int age;

    // Public no-argument constructor
    public Person() {
    }

    // Getter and setter methods for name property
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for age property
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
