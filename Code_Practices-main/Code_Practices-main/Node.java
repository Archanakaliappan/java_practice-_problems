import java.util.*;
class Node{
    int val;
    Node next;
int size=0;
Node head;
Node tail;
public Node(){
this.size=0;
}
 
Node(int val){
    this.val=val;
    this.next=next;

}

void insertfirst(int val){
Node n1=new Node(val );
n1.next=head;
head=n1;
if(tail==null){
    tail=head;
}
size++;
}
void insertLast(int val){
    Node n=new Node(val);
    if(tail==null){
        insertfirst(val);
    }
    n.next=null;
    tail.next=n;
    tail=n;
    size++;
}
 void display(){
    Node temp=head;
    while(temp!=null){
     System.out.print(temp.val +"->");
     temp=temp.next;
    }
 }

    public static void main(String args[]){
        Node node=new Node();
     node.insertfirst(3);
     node.insertfirst(4);
node.insertfirst(4);
node.insertLast(77);
node.insertfirst(44);
node.insertfirst(49);
node.display();
    }
}