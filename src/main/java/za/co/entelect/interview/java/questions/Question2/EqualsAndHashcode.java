package za.co.entelect.interview.java.questions.Question2;

/* Explain how the equals() and hashcode() base functions are related. What do they do?*/

import org.springframework.stereotype.Component;

@Component
public class EqualsAndHashcode {

    private String greetingOne = "Hello World";
    private String greetingTwo = "Hello World";
    ;

    /* The equals() function is used to compare to object values/contents.  */
    public void isObjectsEqual() {
        if (greetingTwo.equals(greetingTwo)) {
            System.out.println("These 2 String objects are equal in value.");
        } else {
            System.out.println("These 2 String objects are not equal.");
        }
    }

    /* Hash code is an integer value representing the content of the object. Hash codes are primarily used for
     efficient data retrieval in data structures like hash tables, hash maps and has sets. */
    public void isHashCodeEqual() {
        if (greetingOne.hashCode() == greetingTwo.hashCode()) {
            System.out.println("These 2 String objects are equal in hash value as well.");
        } else {
            System.out.println("These 2 String objects are not the same hash value.");
        }
    }

    /* equals() can be overridden as its part of the Object class and when overriding equals, hashCode function as well
     must be overridden to maintain contract that equal objects have the same hash code.
     */

}
