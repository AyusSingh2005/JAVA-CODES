
//import java.util.*;
//class Data{
//    int data;
//    Data next;
//
//    Data(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//
//public class PROGRAM {
//    Scanner sc=new Scanner(System.in);
//    Data head=null;
//
//    public void enterElement(){
//
//        System.out.print("enter the data:");
//         int data = sc.nextInt();
//        Data  newData = new Data(data);
//        if(head==null) head= newData;
//        else{
//            Data temp=head;
//            while(temp.next!=null){
//                temp=temp.next;
//            }
//            temp.next=newData;
//        }
//    }
//
//    public void Printing(){
//        if(head==null) System.out.println("Empty list");
//        else{
//            Data temp=head;
//            while(temp != null){
//                System.out.print(temp.data);
//                temp=temp.next;
//                System.out.print(" -> ");
//            }
//            System.out.println("NULL\n");
//
//        }
//    }
//    public void reverse(){
//        Data prev=null,curr=head,next=null;
//        while(curr != null){
//            next=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next;
//        }
//        head = prev;
//    }
//
//    public void countNodes(){
//        int count=0;
//            Data temp=head;
//            while(temp!=null) {
//                count++;
//                temp = temp.next;
//            }
//            System.out.println("Total nodes are: "+ count + "\n");
//    }
//    public void DeleteNode(){
//        Data temp=head,prev=null;
//        System.out.println("Enter the data to delete:");
//        int deleteData=sc.nextInt();
//        if(head==null){
//            System.out.println("LIST EMPTY!");
//            return;
//        }
//        if(temp != null && temp.data==deleteData){
//            head=temp.next;
//            System.out.println("Node deleted!");
//        }
//        while(temp != null && temp.data != deleteData){
//            prev = temp;
//            temp = temp.next;
//
//        }
//        if(temp==null){
//            System.out.println("Data not found!!");
//            return;
//        }
//        prev.next=temp.next;
//        System.out.println("Node deleted!"+deleteData);
//
//    }
//
//    public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//        PROGRAM list = new PROGRAM();
//        System.out.println("");
//        System.out.println("\n1 to enter element || 2 to print List || 3 to Reverse  print List");
//        System.out.println("4 To fund total number of nodes || 5 to Exit");
//
//        while(true){
//            System.out.print("Enter your choice2:");
//            int choice2 =sc.nextInt();
//            switch(choice2){
//                case 1:
//                    list.enterElement();
//                    break;
//                case 2:list.Printing();break;
//                case 3:
//                    list.reverse();
//                    list.Printing();
//                    break;
//                case 4:list.countNodes();break;
//                case 5: list.DeleteNode();
//                break;
//                case 6: return;
//                default:
//                    return;
//
//            }
//        }
//
//    }
//}

//class Data{
//    int data;
//    Data next;
//
//    Data(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//public class PROGRAM {
//    Data head=null;
//    public void Insertion(int data){
//        Data newData = new Data(data);
//        if(head==null)head =newData;
//        else{
//            Data temp=head;
//            while(temp.next != null){
//                temp=temp.next;
//            }
//            temp.next=newData;
//        }
//    }
//    public void Displayed(){
//        if(head==null) System.out.println("EMPTY LIST!");
//        else{
//            Data temp=head;
//            while(temp != null){
//                System.out.print(temp.data);
//                System.out.print(" -> ");
//                temp=temp.next;
//            }
//            System.out.println();
//            totalList();
//            System.out.println();
//            addition();
//            maxElement();
//            MinElement();
//        }
//    }
//    public void totalList(){
//        if(head==null) System.out.println("list is empty!");
//        int count=0;
//        Data temp=head;
//        while(temp != null){
//            count++;
//            temp=temp.next;
//        }
//        System.out.print("Total number of lists are: "+count);
//    }
//    public void addition(){
//        Data temp=head;
//        int Total = 0;
//        while(temp != null){
//            Total = Total+temp.data;
//            temp=temp.next;
//        }
//
//        System.out.print("THE ADDITION OF THE LIST ELEMENTS IS: "+ Total);
//        System.out.println();
//    }
//    public void maxElement(){
//        if(head==null) System.out.println("list is empty!");
//        Data temp=head;
//        int max=temp.data;
//        int smax=0;
//        Data Next = head.next;
//
//        while(Next != null){
//            if(max<Next.data){
//                smax=max;
//                max=Next.data;
//            }
//            Next=Next.next;
//        }
//        System.out.println("LARGEST ELEMENT: "+max);
//        System.out.println("SECOND LARGEST ELEMENT: "+smax); return;
//    }
//
//    public void MinElement(){
//        if(head==null) System.out.println("list is empty!");
//        Data temp=head;
//        Data Next=head.next;
//        int min=temp.data;
//        while(Next != null){
//            if(min > Next.data){
//                min=Next.data;
//            }
//            Next=Next.next;
//        }
//        System.out.println("Smallest element is: "+ min);
//
//    }
//
//    public static void main(String[] args) {
//    PROGRAM list = new PROGRAM();
//    list.Insertion(10);
//    list.Insertion(30);
//    list.Insertion(100);
//    list.Insertion(50);
//    list.Insertion(1);
//    list.Insertion(40000);
//    list.Insertion(60);
//    list.Displayed();
//    }
//}