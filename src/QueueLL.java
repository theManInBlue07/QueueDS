public class QueueLL {

    Node beginingofQueue;
    Node topOfQueue;
    //Node head;
    int data;
    int size =0;

    public QueueLL(int data){
        this.data = data;
        Node newNode = new Node(data);
        //this.head = newNode;
        this.beginingofQueue = newNode;
        this.topOfQueue = newNode;
        size++;
        System.out.println("Queue has been initialized sucessfully");
    }

    public boolean isEmpty(){
        if(size ==-1){
            return true;
        }else{
            return  false;
        }
    }
    public void enqueue(int ele){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            Node newNode = new Node(ele);
            topOfQueue.next = newNode;
            topOfQueue = newNode;
            size++;
            System.out.println("Queue has been enqueued sucessfully");
        }
    }

    public int peek(){
        return beginingofQueue.data;
    }

    // dequeue

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            Node temp = beginingofQueue;
            beginingofQueue = temp.next;
            temp.next =null;
            size --;
            System.out.println("Queue has been dequeued sucessfully");
        }
    }


    // queue delete

    public void delete(){
        beginingofQueue = null;
        topOfQueue = null ;
        System.out.println("Queue has been deleted sucessfully");
    }

}
