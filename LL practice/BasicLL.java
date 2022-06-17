class linkedList{
    
    class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }

    Node head;

    //Inserting a node in the beginning
    public void push(int new_data){
        System.out.println("Inserting in the beginning");
        Node newnode = new Node(new_data);
        newnode.next = head;
        head = newnode;
    }

    //Inserting a node in the end
    public void end(int new_data){
        System.out.println("Inserting in the end");
        Node newnode = new Node(new_data);
        if(head == null){
            head = newnode;
            return;
        }
        Node tnode = head;
        while(tnode.next!=null)
            tnode = tnode.next;
        tnode.next = newnode;
    }

    //Printing a linkedlist
    public void printlist(){
        Node tnode = head;
        while(tnode!=null){
            System.out.print(tnode.data + "->");
            tnode =tnode.next;
        }
        System.out.println("NULL");
    }

    //Inserting a node when a prev node is known
    public void insertafterprevnode(int new_data, Node prevnode){

    }
    //Inserting a node at a position specified by the user
    public void insertafterposition(int new_data, int position){

    } 

    //Printing the length of the list
    public int length(){
        Node tnode = head;
        int count  = 0;
        while(tnode!=null){
            count = count+1;
            tnode = tnode.next;
        }
        return count;
    }



    //main function
    public static void main(String args[]){
        System.out.println("Hello Linkedlists");
    
        linkedList llist = new linkedList();
        llist.end(2);
        llist.push(7);
        llist.push(8);
        llist.end(10);
        llist.end(22);
        llist.printlist();
        System.out.println(llist.length());
    }
}