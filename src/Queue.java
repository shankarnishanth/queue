import java.util.LinkedList;

public class Queue {

     LinkedList<Integer> queue = new LinkedList<>();

     public void enqueue(int data){
         queue.addLast(data);

     }

    public void dequeue(){
         if(queue.size() !=0){
             queue.pop();
         }else {
             System.out.println("queue is empty");

         }
    }
    public void display(){
        System.out.println("Elements in queue");
        for (Integer integer : queue){
            System.out.println(" "+integer);
        }
    }
}


