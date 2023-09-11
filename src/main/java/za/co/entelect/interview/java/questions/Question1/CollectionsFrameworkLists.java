package za.co.entelect.interview.java.questions.Question1;


/*Explain how the collections framework helps us in Java, and the common data structures that you use?*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionsFrameworkLists {

    /* The Collections Framework is a set of classes and interfaces in the Java API (java.util package) that provides a unified architecture
    for representing and manipulating collections of objects. A collection, in this context, refers to a group of objects. */


    /* The framework simplifies the task of managing groups of objects, such as lists, sets, and maps.
       Collection is the root interface for all collection types. */
    /* Common Data structures used:*/

    public void arrayList() {

        //List is the interface and ArrayList is the implementation. List is an unordered collection that allows duplicates.
        //ArrayList is implemented as a dynamic array that can grow or shrink as needed.
        // Fast random access.
        // slower insertions and deletions in the middle of the list (O(n) time complexity).
        // Resizable and automatically handles capacity management.

        //Array list are suitably used for scenarios where you need fast access to elements and dont frequently insert or remove elements from the list.

        //Array List
        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(16);
        randomNumbers.add(23);
        randomNumbers.add(32);

        for (Integer number : randomNumbers) {
            System.out.println(number);
        }



    }

    public void linkedList() {

      /*  The linked list stores items in 'containers'. The list has a link to the first container and each container has
          a link th the next container in the list.To add an element to the list, the element is placed into a new container
          and that container is linked to one of the other containers in the list.
      */

        //Typical linked list structure or doubly linked list has previous node address, data and next node address

        //Linked List
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //Linked list has some beneficial more efficient methods to manipulate the list with these methods compared to Array List:
        cars.addFirst("Honda");
        cars.addLast("Isuzu");
        cars.removeFirst();
        cars.removeLast();
        cars.getFirst();
        cars.getLast();

    }

    //Don't use this and is not common.
    public void vectorList(){
        /* vector is similar to Array list but is synchronized making it thread safe. Slower than Array List due to synchronization
        * and not recommended for single threaded applications. Automatically resizable. Rarely used in modern programming because
        * synchronization overheads can affect performance.  */

        Vector<Integer> vector = new Vector<>();

        // Add elements to the vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
    }

    /*    Other uncommon List implementations hardly used.*/
    //CopyOnWriteArrayList
    //Stack
    //

}
