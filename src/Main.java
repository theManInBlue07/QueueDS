public class Main {
    public static void main(String[] args) {

        /**
         * // Array Implementation of queue
         *   QueueArr q1 = new QueueArr(3);
         *
         *         System.out.println(q1.isFull());
         *         System.out.println(q1.isEmpty());
         *         q1.enqueue(9);
         *         q1.enqueue(10);
         *         q1.enqueue(11);
         *         //q1.enqueue(12);
         *         q1.dequeue();
         *         q1.dequeue();
         *         q1.dequeue();
         *         q1.dequeue();
         *         q1.enqueue(1);
         *         System.out.println(q1.peek());
         *         q1.delete();
         *         try {
         *             q1.enqueue(5);
         *         }catch (Exception e){
         *             System.out.println(e.getMessage());
         *         }


         */

        CircularQueue cq1 = new CircularQueue(3);
        cq1.enqueue(1);
        cq1.enqueue(2);
        cq1.enqueue(3);
        cq1.enqueue(4);

        System.out.println(cq1.peek());
        cq1.dequeue();
        System.out.println(cq1.peek());
        cq1.enqueue(4);
        System.out.println(cq1.arr[cq1.topOfQueue]);
        System.out.println(cq1.peek());
        cq1.dequeue();
        cq1.enqueue(5);
        System.out.println(cq1.peek());
        System.out.println(cq1.arr[cq1.topOfQueue]);
        cq1.dequeue();
        System.out.println(cq1.peek());
        cq1.enqueue(6);
        System.out.println(cq1.arr[cq1.topOfQueue]);


    }
}