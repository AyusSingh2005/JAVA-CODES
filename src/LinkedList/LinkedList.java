////
////
////
////import java.util.Scanner;
////class Students{
////    int rollno;
////    String name;
////    String course;
////    Students next = null;
////
////    Students(int rollno, String name, String course){
////        this.rollno=rollno;
////        this.name=name;
////        this.course=course;
////        this.next=null;
////    }
////}
////
////public class LinkedList {
////    Students head ;
////
////    public void insert(int rollno, String name, String course){
////
////        Students newNode= new Students(rollno,name,course);
////        if(head==null){
////            head=newNode;
////        }else{
////            Students temp = head;
////            while(temp.next != null){
////                temp=temp.next;
////            }
////            temp.next=newNode;
////        }
////    }
////
////    public void display(){
////        Students temp = head;
////
////        while(temp != null){
////            System.out.println("----->Students List<-----");
////            System.out.println("Students rollNo is: "+ temp.rollno);
////            System.out.println("Students name is: "+ temp.name);
////            System.out.println("Students course is: "+ temp.course);
////            System.out.println("-----------------------------------");
////            temp=temp.next;
////        }
////        System.out.println("NULL");
////    }
////    public static void main(String[]args){
////        LinkedList list = new LinkedList();
////        Scanner sc = new Scanner(System.in);
////        int ch=1;
////        do{
////            System.out.println("Enter students details below");
////            System.out.print(" Enter rollNo:");
////            int rollno=sc.nextInt();
////
////            sc.nextLine();
////            System.out.print("Enter student Name: ");
////            String name=sc.nextLine();
////
////            System.out.print("Enter course: ");
////            String course=sc.nextLine();
////        list.insert(rollno,name,course);
////            System.out.println("want to add more  (YES: 1 || NO:0)");
////            ch=sc.nextInt();
////            sc.nextLine();
////        } while(ch==1);
////        System.out.println("PRINTING STUDENTS DETAILS");
////        list.display();
////    }
////}
////
//
//
//class Odd{
//    int data;
//    Odd next;
//
//    Odd(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//
//public class LinkedList {
//    Odd head;
//
//    public void insert(int data){
//        Odd newData=new Odd(data);
//        if(head==null) head=newData;
//        else{
//            Odd temp=head;
//            while(temp.next!=null){
//                temp=temp.next;
//            }
//            temp.next=newData;
//        }
//    }
//
//    public void Display(){
//        Odd temp=head;
//        if(temp==null) System.out.println("List is empty!");
//        else{
//            while(temp != null){
//                System.out.print(temp.data + "-> ");
//                temp=temp.next;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.insert(1);
//        list.insert(2);
//        list.insert(3);
//        list.insert(4);
//        list.insert(5);
//        System.out.print ("Unfiltered List is: ");
//        list.Display();
//
//
//    }
//}




//import java.util.Scanner;
//class Practice{
//    int data;
//    Practice next =null;
//
//    Practice(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//
//public class LinkedList {
//    Practice head;
//    public void insert(int data){
//        Practice newData = new Practice(data);
//
//        if(head==null){
//            head = newData;
//        }else{
//            Practice temp = head;
//            while(temp.next != null){
//                temp=temp.next;
//            }
//            temp.next=newData;
//        }
//    }
//
//    public void display(){
//        Practice temp = head;
//
//        while(temp != null){
//            System.out.println("THE DATA IS:"+temp.data);
//            temp=temp.next;
//        }
//        System.out.println("NULL");
//    }
//
//    public static void main(String[]args){
//        Scanner sc= new Scanner(System.in);
//        LinkedList list = new LinkedList();
//        int ch=0;
//        do{
//            System.out.print("Enter the data:");
//            int value = sc.nextInt();
//            list.insert(value);
//            System.out.print("Want to add more ( YES 1 || NO 0)-: ");
//            ch=sc.nextInt();
//            sc.nextLine();
//        }while(ch==1);
//
//        list.display();
//    }
//}


