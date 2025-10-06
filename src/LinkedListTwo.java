//import java.util.*;
//class Node{
//
//    int rollno;
//    String name;
//    Node next;
//
//    Node(int rollno, String name){
//        this.rollno=rollno;
//        this.name=name;
//        this.next=null;
//    }
//}
//
//class LinkedList{
//    Scanner sc= new Scanner(System.in);
//    Node head = null;
//
//
//    public void createList(){
//        int ch =1;
//        Node temp = null;
//
//        while(ch==1){
//            System.out.print("Enter roll_no: ");
//            int roll = sc.nextInt();
//            System.out.print("Enter name: ");
//            String name=sc.next();
//
//            Node newNode = new Node(roll,name);
//
//            if(head == null){
//                head = temp = newNode;
//            }else{
//                temp.next = newNode;
//                temp = newNode;
//            }
//            System.out.println("ADD MORE? (yes 1 || no 0");
//            ch= sc.nextInt();
//        }
//    }
//
//
//    public void display(){
//        if(head == null){
//            System.out.println("List is empty!");
//            return;
//        }
//        System.out.println("\n Student List");
//
//        Node temp = head;
//        while(temp != null){
//            System.out.println("Roll no: "+ temp.rollno +"  Name: "+temp.name);
//            temp = temp.next;
//        }
//    }
//
//    public int count(){
//        int count = 0;
//        Node temp = head;
//        while(temp != null){
//            count ++;
//            temp = temp.next;
//        }
//        return count;
//    }
//
//    public void deleteAtpos(){
//        System.out.println("Enter the position to delete:");
//        int pos = sc.nextInt();
//
//        int total = count();
//        if(pos <1 || pos > total){
//            System.out.println("Invalid operation!");
//            return;
//        }
//        if(pos == 1){
//            head = head.next;
//            return;
//        }
//
//        Node temp = head;
//        Node prev = null;
//        for(int i=1;i<pos;i++){
//            prev = temp;
//            temp = temp.next;
//        }
//        prev.next = temp.next;
//
//    }
//
//}
//
//
//public class LinkedListTwo {
//    public static void main(String[]args){
//        LinkedList list = new LinkedList();
//
//        list.createList();
//        list.display();
//        list.deleteAtpos();
//        list.display();
//    }
//}