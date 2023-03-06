public class QueueArr {
    int[] arr;
    int beginingOfQueue;
    int topOfQueue;
    //int size;

    public QueueArr(int size){
        this.arr= new int[size];
        this.beginingOfQueue =-1;
        this.topOfQueue =-1;

        System.out.println("A new Queue of size "+size+" has been initialized .");
    }

    public void enqueue(int ele){
        if(isFull()){
            System.out.println("element can't be inserted queue is full");
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
        if(isEmpty()){
            System.out.println("Queue is empty");

        } else if (beginingOfQueue > topOfQueue) {
            System.out.println("Queue is empty");
            beginingOfQueue =-1;
            topOfQueue =-1;
            return;
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
