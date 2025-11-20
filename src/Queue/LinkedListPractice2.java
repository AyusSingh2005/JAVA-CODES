package Queue;
import java.util.*;
class Data{
    int data;
    Data next;

    Data(int data){
        this.data = data;
        this.next=null;
    }
}
public class LinkedListPractice2 {
    Scanner sc=new Scanner(System.in);
    Data head;
    int count=0;
    public void Insertion(int data){
        Data newData = new Data(data);
        Data temp=head;
        if(head==null)head=newData;
        else {
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newData;
        }
        }

    public  void Display(){
        if(head==null) System.out.println("the list is empty");
        else{
            Data temp=head;
            while(temp!=null){
                System.out.print(temp.data + " -> ");
//                count++;
//                count++;
                temp=temp.next;


            }
            System.out.println(" NULL");
        }
    }

    public void totalNodes(){
        System.out.println("total number of Nodes are: "+count);
    }

public void maxValue(){
        Data temp=head;
        int result=0;
        while(temp.next!=null) {
            if(temp.data>result){
               result = temp.data;
            }
            temp=temp.next;
        }
    System.out.println("THE MAX VALUE IS:"+result);
}

    public void totalValue(){
        Data temp=head;
        int result=0;
        if(head==null) System.out.println("Empty list");
        else{
            while(temp!=null){
                result+=temp.data;
                temp=temp.next;
                count++;

            }
            totalNodes();
        }
        System.out.println("THE ADDITION IS: "+result);
    }

    public void midPoint(){
        Data slow=head;
        Data fast=head;

            while(fast.next!=null&&fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.println("The mid point is: "+ slow.data);


    }
    public void sortedList(){
        Data temp=head;
        int Temporary=0;
        while(temp.next!=null){
            if(temp.data>temp.next.data){
                Temporary=temp.data;
                temp.data=temp.next.data;
                temp.next.data=Temporary;
            }
            temp=temp.next;
        }
        System.out.println("SORTED LIST");
        Display();
        }


//        public void BinarySearching(){
//        Data temp=head;
//        System.out.print("Enter the target: ");
//        int target=sc.nextInt();
//
//
//        }


    public static void main(String[]args){
        LinkedListPractice2 list = new LinkedListPractice2();
        list.Insertion(20);
        list.Insertion(30);
        list.Insertion(50);
        list.Insertion(48);
        list.Insertion(80);
        list.Insertion(60);
        list.Insertion(39);
        list.Display();
//        list.totalValue();
//        list.maxValue();
//          list.midPoint();
//        list.sortedList();


    }
}