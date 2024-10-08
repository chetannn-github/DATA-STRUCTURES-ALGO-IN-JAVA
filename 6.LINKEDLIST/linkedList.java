

class LinkedList {
    private static class Node {
        int data ;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    
    private Node  head;
    public LinkedList (){
        head = null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;

        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList (){
        Node current = head ;
        while(current!= null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public int size (){
        int count = 0;
        Node current = head; 
        while(current != null){ 
            count++;
            current = current.next;
        }
        return count;
    }   

    public boolean search (int data){
        Node  current = head;
        while(current != null){
            if(current.data ==data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

   
    public void remove(int data){
        if(head == null){return;}

        if(head.data==data){
            head = head.next;
        }
        
        Node current = head;
        while(current.next != null){
            if(current.next.data== data){
                current.next = current.next.next;

            }
            current = current.next;
        }
    }




}
