package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTesting {
    public static void main(String[] args) {
        //1>Declaring queue
        Queue<Integer> myQueue = new LinkedList<>();//left side interface = right side implementations

        //UNDERSTANDING THE METHODS() OF THE QUEUE
        //1> add(E e):--->add the elements into the queue in tail.
                     // if not able to add elements to the queue it throws exception.
        myQueue.add(1);

        //2>offer(E e):---->add the elements into the queue in tail.
                        // returns false if the elements cannot be added.
        myQueue.offer(2);
        myQueue.offer(55);


        Utility.print(myQueue);

        //3>peek():--->just check elements at the head but not remove from Queue
                       //gives null if queue is empty

        System.out.println(myQueue.peek());

        //4>element();
        System.out.println(myQueue.element());

        //5>remove();
        System.out.println(myQueue.remove());

        //6>
        Utility.print(myQueue);

        //7>poll();--->removes element from head;;returns NULL if queue is empty
        System.out.println(myQueue.poll());
        Utility.print(myQueue);

        System.out.println(myQueue.poll());
        Utility.print(myQueue);

        System.out.println(myQueue.poll());
       // System.out.println(myQueue.remove());
       // System.out.println(myQueue.element());


    }
}
