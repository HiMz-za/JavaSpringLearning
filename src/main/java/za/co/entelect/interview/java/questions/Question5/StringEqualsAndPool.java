package za.co.entelect.interview.java.questions.Question5;

import org.springframework.stereotype.Component;

/* Explain why == is not a safe way to compare Strings. Explain the String pool */
@Component
public class StringEqualsAndPool {

    /* the == operator on Strings compares the object reference/ memory location address rather then its content or value */

    String phoneBrand = new String("Apple Iphone");
    String applePhoneBrand = "Apple Iphone";

    public void compareTwoStrings() {

        /* Java maintains a special allocation in memory for Strings called the String pool. When a String is created
          using string literals, Java checks if a strign with the same value exists in the pool. If it does , the new string references
          the existing one.*/

        if (phoneBrand == applePhoneBrand) {
            System.out.println("These string objects are the same reference in memory.");
        } else {
            System.out.println("these String objects are NOT of the same reference of in memory.");
        }

        //Right way of comparison by using equals():
        if (phoneBrand.equals(applePhoneBrand)){
            System.out.println("These string objects are the same value.");
        }else {
            System.out.println("These string objects are NOT the same value.");
        }

    }
}
