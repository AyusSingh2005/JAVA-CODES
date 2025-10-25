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
        Data temp=head,prev=null;
        if(head==null){
            System.out.println("Empty List!");
        }
       else if(head.data==target) System.out.println("ElementDeleted");
       else{
           while(temp.next!=null && temp.data!=target){
               prev=temp;
               temp=temp.next;
           }
           prev.next=temp.next;
        }


    }




    public static void main(String[]args){
        LinkedListPractice list = new LinkedListPractice();
        list.add(20);list.add(50);list.add(30);list.add(40);list.add(60);
        list.Display();
        list.delete();
        list.Display();

    }
}