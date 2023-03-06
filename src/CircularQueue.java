public class CircularQueue {
    int[] arr;
    int beginingOfQueue;
    int topOfQueue;
    //int size;

    public CircularQueue(int size){
        this.arr= new int[size];
        this.beginingOfQueue =-1;
        this.topOfQueue =-1;

        System.out.println("A new Queue of size "+size+" has been initialized .");
    }

    public void enqueue(int ele){
        int n  = arr.length;
        if(isFull()){
            if (beginingOfQueue>0 && arr[beginingOfQueue-1] ==-1 && topOfQueue == arr.length-1) {
                // need to move top circularly
                topOfQueue = (topOfQueue +1)%n; /// reset the value of top queue
                arr[topOfQueue] = ele;
                System.out.println("element inserted sucessfully at top of queue && the array has been rotated circularly");
            }else{
                System.out.println("element can't be inserted queue is full");
            }

        } else if (beginingOfQueue ==-1 && topOfQueue ==-1) {
            beginingOfQueue ++;
            arr[beginingOfQueue] =ele;
            topOfQueue++;
            System.out.println("Element inserted at the begining of the queue");
        } else{
            topOfQueue ++;
            arr[topOfQueue] = ele;
            System.out.println("element inserted sucessfully at top of queue");
        }
    }

    public boolean isEmpty(){
        if(beginingOfQueue == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if(topOfQueue == arr.length-1){
            return true;
        }else{
            return false;
        }
    }
    public int peek(){
        return arr[beginingOfQueue];
    }

    public void dequeue(){
        int n = arr.length;
        if(isEmpty()){
            System.out.println("Queue is empty");

        } else if (beginingOfQueue == arr.length-1 && topOfQueue == arr.length-2) {
            arr[beginingOfQueue] = -1;
            beginingOfQueue = (beginingOfQueue +1)%n;
            System.out.println("Element has been sucessfully removed");
        } else{
            arr[beginingOfQueue] = -1;
            beginingOfQueue++;
            System.out.println("Element has been sucessfully removed");
        }
    }

    public void delete(){
        arr= null;
        System.out.println("Queue has been deleted sucessfully");
    }




}
