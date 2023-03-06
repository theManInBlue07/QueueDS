public class QueueMain {
    public static void main(String[] args) {
        QueueLL q1 = new QueueLL( 5);
        System.out.println(q1.peek());
        System.out.println(q1.topOfQueue.data);
        q1.enqueue(6);
        //System.out.println(q1.beginingofQueue.data);
        System.out.println(q1.topOfQueue.data);
        System.out.println(q1.peek());

        q1.enqueue(7);
        System.out.println(q1.topOfQueue.data);

        System.out.println(q1.peek());
        System.out.println(q1.size);
        q1.dequeue();
        System.out.println(q1.peek());
        q1.delete();

        try{
            q1.enqueue(8);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
