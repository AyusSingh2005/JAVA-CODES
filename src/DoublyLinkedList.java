//import java.util.*;
//class Node{
//    int data;
//    Node next = null;
//    Node prev = null;
//
//    Node(int data){
//        this.data=data;
//        this.next=null;
//        this.prev=null;
//    }
//}
//
//class DoublyLinkedLIST{
//    Node head;
//
//    public void add(int data){
//        Node newNode = new Node(data);
//
//        if(head == null){
//            head=newNode;
//            return;
//
//        }
//
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        temp.next = newNode;
//        newNode.prev=temp;
//    }
//
//    public void DisplayForward(){
//        Node temp = head;
//        while(temp != null){
//            System.out.println(temp.data+" ");
//            temp= temp.next;
//        }
//        System.out.println();
//    }
//
//    public void DisplayBackward(){
//        Node temp= head;
//        if(temp == null) return;
//
//        while(temp.next != null){
//            temp = temp.next;
//        }
//
//        while (temp != null){
//            System.out.println(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//}
//
//public class DoublyLinkedList{
//    public static void main(String[]args){
//        DoublyLinkedLIST Dll = new DoublyLinkedLIST();
//
//        Dll.add(20);
//        Dll.add(30);
//        Dll.add(40);
//        Dll.add(50);
//
//        System.out.println("Forward:");
//        Dll.DisplayForward();
//
//        System.out.println();
//
//        System.out.println("Backward");
//        Dll.DisplayBackward();
//    }
//}