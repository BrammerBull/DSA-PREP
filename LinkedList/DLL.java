public class DLL {
    Node head;
    Node tail;
    int size;
    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }

        Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);

        node.next = head;
        node.prev = null;
    

        if(head != null){
                 head.prev = null;
        }

        head = node;
    }

    public void insertLast(int value){
        Node node  = new Node( value);
        Node temp = head;
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
    }
    
    public void delete(){

        if(head == null){
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        head =head.next;
        head.prev = null;
        temp.next = null;

    }
    
    public void deleteAtEnd(){
        if(tail == null){
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            return;
        }

        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
    }
    
    public void display(){

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        DLL obj = new DLL();
        obj.insertFirst(9);
        obj.insertFirst(8);
        obj.insertFirst(5);
        obj.insertFirst(3);
        obj.insertLast(19);
        obj.delete();
       obj.deleteAtEnd();
        obj.display();
    }
}
