package LinkedList;
import java.util.*;
class Data{
    int data;
    Data next;
    Data(int data){
        this.data=data;
        this.next=null;
    }
}

public class LinkedListPractice {
    Scanner sc = new Scanner(System.in);
    Data head;
    public void add(int data){
       Data newData = new  Data(data);
       if(head==null)head = newData;
       else{
           Data temp=head;
           while(temp.next!=null){
               temp=temp.next;
           }
           temp.next=newData;
       }
    }

    public void Display(){
        if(head==null) System.out.println("the list is empty!");
        else{
            Data temp=head;
            while(temp!= null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("NULL");
        }
    }


    public void delete(){
        System.out.print("enter element you want to delete: ");
        int target=sc.nextInt();
        if(head==null){
            System.out.println("Empty List!");
        }
        else{
            Data temp=head;
            while(temp.next!=null){
                temp=temp.next;
                if(temp.data==target){
                    temp.data=temp.next.data;
                    System.out.println("Done!");return;}


            }
        }
    }

    public void sorting(){
        if(head==null) System.out.println("Empty List");
        else{
            Data temp=head.next, prev = head;
            while(temp!=null){
                //20 50 30 40 60
                 if(temp.data<prev.data){
                     Data New = temp;
                     temp=prev;
                     prev=New;
                 }
                temp=temp.next;
            }
            System.out.println("Sorting Done");
        }
        Display();
    }


    public static void main(String[]args){
        LinkedListPractice list = new LinkedListPractice();
        list.add(20);list.add(50);list.add(30);list.add(40);list.add(60);
        list.Display();
        //list.delete();
    list.sorting();
    }
}