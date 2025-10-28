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
    int count=0;

    public void add(int data){
       Data newData = new  Data(data);

       if(head==null)head = newData;
       else{
           Data temp=head;
           while(temp.next!=null){
               temp=temp.next;
           }
           temp.next=newData;
           count++;
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
    public void middle(){
        if(head==null) System.out.println("empty list");
        if(head.next==null) System.out.println("the list has only one node");
        Data slow = head,fast=head;
        while(fast!=null&&fast.next!=null){

                fast=fast.next.next;

            slow=slow.next;
        }
        System.out.println("the middle element is : "+slow.data);
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
        Scanner sc = new Scanner(System.in);
    list.add(20);list.add(30);list.add(40);list.add(50);list.add(60);
list.middle();
//        System.out.println("WELCOME   1 to ADD | 2 to Display | 3 to Delete | 4 to Exit");
//        while(true){
//            System.out.print("Enter your choice: ");
//            int  choice= sc.nextInt();
//            switch(choice){
//                case 1:
//                    System.out.print("Enter the element: ");
//                    int value=sc.nextInt();
//                    list.add(value);
//                    break;
//                case 2:
//                    list.Display();
//                    break;
//                case 3:
//                    list.delete();
//
//                    break;
//                case 4:
//                    return;
//
//                default:
//                    System.out.println("Enter the valid number");
//            }
       // }


    }
}