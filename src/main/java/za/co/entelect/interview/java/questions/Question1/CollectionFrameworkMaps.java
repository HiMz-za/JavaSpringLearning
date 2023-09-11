package za.co.entelect.interview.java.questions.Question1;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

@Component
public class CollectionFrameworkMaps {

        /* The Collections Framework is a set of classes and interfaces in the Java API (java.util package) that provides a unified architecture
    for representing and manipulating collections of objects. A collection, in this context, refers to a group of objects. */


    /* The framework simplifies the task of managing groups of objects, such as lists, sets, and maps.
       Collection is the root interface for all collection types. */
    /* Common Data structures used:*/

    /* A map is a collection that stores key value pairs where each key is associated with exactly one value. Maps are used to represent data in
       a dictionary-like fashion allowing you to retrieve values based on their keys. */

    public void hashMap() {

        // Most common map type used.
        // Unordered collection of key-value pairs
        // Allows one null key and multiple null values.
        // Provides fast access and retrieval of key-value pairs.

        Map<String, Integer> personAgeHashMap = new HashMap<>();

        personAgeHashMap.put("Alice", 25);
        personAgeHashMap.put("Bob", 30);
        personAgeHashMap.put("Charlie", 28);

        // Retrieve values based on keys
        int ageOfAlice = personAgeHashMap.get("Alice");
        System.out.println("Age of Alice: " + ageOfAlice);

        //Iteration
        for (Map.Entry<String, Integer> entry : personAgeHashMap.entrySet()) {
            System.out.println("Hash Map: " + entry.getKey() + ": " + entry.getValue());
        }

    }

    public void treeMap() {
        //TreeMap is implemented as a Red-Black Tree which maintains key in a sorted order.
        //Provides fast access and retrieval but slower than HashMap.
        // Use this implementation when you need a map that maintains keys in a specific order, such as alphabetical/ numerical.

        Map<String, Integer> personAgeTreeMap = new TreeMap<>();

        personAgeTreeMap.put("Alice", 25);
        personAgeTreeMap.put("Bob", 30);
        personAgeTreeMap.put("Charlie", 28);

        int ageOfAlice = personAgeTreeMap.get("Alice");
        System.out.println("Age of Alice: " + ageOfAlice);

        // Iteration
        for (Map.Entry<String, Integer> entry : personAgeTreeMap.entrySet()) {
            System.out.println("Tree Map: " + entry.getKey() + ": " + entry.getValue());
        }
    }

    public void linkedHashMap() {
        //LinkedHashMap maintains insertion order.
        // provides fast access and predictable iteration.
        //Use case when you need to maintain the order of key-value pairs or when predictable iteration order is important.

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Alice", 25);
        linkedHashMap.put("Bob", 30);
        linkedHashMap.put("Charlie", 28);


        int ageOfAlice = linkedHashMap.get("Alice");
        System.out.println("Age of Alice: " + ageOfAlice);

        // Iteration
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Linked Hash Map: " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
