package Day4.collectionframework1;

import java.util.*;
public class QueueMethodsExample {
        public static void main(String[] args) {

        Queue oqueue=new LinkedList();

        oqueue.add("1");
        oqueue.add("2");
        oqueue.add("3");
        oqueue.add("4");
        oqueue.add("5");

        Iterator itr=oqueue.iterator();

        System.out.println("Initial Size of Queue :"+oqueue.size());

        while(itr.hasNext())
        {
            String iteratorValue=(String)itr.next();
            System.out.println("Queue Next Value :"+iteratorValue);
        }

        // get value and does not remove element from queue
        System.out.println("Queue peek :"+oqueue.peek());

        // get first value and remove that object from queue
        System.out.println("Queue poll :"+oqueue.poll());
//oqueue.remove();
        System.out.println("Final Size of Queue :"+oqueue.size());
        Iterator itr1=oqueue.iterator();

        while(itr1.hasNext())
        {
            String iteratorValue=(String)itr1.next();
            System.out.println("Queue Next Value :"+iteratorValue);
        }

    }
}