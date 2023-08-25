public class SLL {
    Node head;
    Node tail;
    int size;
     class Node{
        int value;
         Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size = size +1;

    }

    public void insertLast(int value){
        Node node = new Node(value);

        if(tail == null){
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;

        size = size+1;

    }

    public void insert(int value, int index){

        if(index == 0){
            insertFirst(value);       //edge case 1: if your linked list is empty, you are adding element at the
                return;                       // first index
        }

        if(index == size){
            insertLast(value); 
            return;      //edge case 2: if you are adding element at the last position
        }

        Node temp = head;

        for(int i =1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
      
        if(head == null){
             tail = null;
        }
        size--;
        return val;
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        SLL obj = new SLL();
        obj.insertFirst(2);
        obj.insertFirst(5);
        obj.insertFirst(8);
        obj.insertFirst(3);
        obj.insertLast(14);
        obj.insert(7, 2);
        obj.deleteFirst();
        obj.display();
    }
}

