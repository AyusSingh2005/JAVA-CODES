////import java.util.*;
////
////class Student{
////    int rollno;
////    String name;
////    String course;
////    Student next;
////
////    Student(int rollno, String name, String course){
////        this.rollno= rollno;
////        this.name = name;
////        this.course= course;
////        this.next = null;
////
////    }
////}
////
////class StudentManagement{
////    Student head = null;
////    Scanner sc = new Scanner(System.in);
////
////    public void addStudent(){
////        System.out.print("Enter rollNo: ");
////        int roll =sc.nextInt();
////        sc.nextLine();
////        System.out.print("Enter Full Name: ");
////        String name = sc.nextLine();
////        System.out.print("Enter course: ");
////        String course = sc.nextLine();
////
////        Student newStudent = new Student(roll,name, course);
////
////        if(head == null){
////            head = newStudent;
////        }else{
////            Student temp = head;
////            while(temp.next != null){
////                temp = temp.next;
////            }
////            temp.next = newStudent;
////        }
////        System.out.println("Student added Successfully!");
////    }
////
////    public void DisplayStudents(){
////        if(head == null){
////            System.out.println("The list is Empty!");
////            return;
////        }
////        System.out.println("\n\t------Student List------");
////        Student temp = head;
////        while(temp!= null){
////            System.out.println("Name: "+temp.name);
////            System.out.println("Roll No: "+temp.rollno);
////            System.out.println("Course: "+temp.course);
////
////            temp = temp.next;
////        }
////        System.out.println();
////    }
////
////    public void DeleteStudent(){
////        if(head == null){
////            System.out.println("No Student record exist to delete!");
////            return;
////        }
////        System.out.print("Enter Roll No to Delete: ");
////        int Deletevalue = sc.nextInt();
////
////        Student temp = head,prev=null;
////
////        while(temp != null && temp.rollno != Deletevalue){
////            prev = temp;
////            temp = temp.next;
////        }
////        if(temp == null){
////            System.out.println("Student with roll no: "+temp.rollno+" Not Found!");
////            return;
////        }
////
////        if(temp == head){
////            head = head.next;
////        }else{
////            prev.next = temp.next;
////        }
////        System.out.println("Student record deleted!");
////    }
////
////
////    public void TotalStudents(){
////        int count = 0;
////        Student temp = head;
////        while(temp!= null){
////            count++;
////            temp = temp.next;
////        }
////        System.out.println("Total Students are: "+count+ "\n");
////    }
////
////
////    public void RollnoSort(){
////        if(head == null || head.next==null)return;
////
////        for(Student i = head;i.next!=null;i=i.next){
////            for(Student j = i.next;j!= null; j= j.next){
////                if(i.rollno>j.rollno){
////                    int r = i.rollno;String n = i.name;String c = i.course;
////                    i.rollno=j.rollno;i.name=j.name;i.course=j.course;
////                    j.rollno=r;j.name = n; j.course= c;
////                }
////            }
////        }
////        System.out.println("Students List Sorted By RollNo:");
////    }
////
////    public void sortByName(){
////        if(head == null|| head.next==null) return;
////
////        for(Student i = head;i.next !=  null;i=i.next){
////            for(Student j = i.next; j != null; j=j.next){
////                if(i.name.compareToIgnoreCase(j.name)>0){
////                    int r = i.rollno; String n = i.name; String c=i.course;
////                    i.rollno=j.rollno;i.name=j.name;i.course=j.course;
////                    j.rollno=r; j.name=n;j.course=c;
////                }
////            }
////        }
////        System.out.println("Student Record Sorted By Name!");
////    }
////
////        }
////
////
////        public class LinkedListThree {
////    public static void main(String[]args){
////        Scanner sc = new Scanner(System.in);
////        StudentManagement sm = new StudentManagement();
////
////        while(true){
////            System.out.println("\n\n\t=== Student Management System ===");
////            System.out.println("\n1. Add Student || 2. Display Students ||3. Delete Student || 4. Count Students");
////            System.out.println("\t\t5.Sort by Roll No || 6.Sort by Name || 7. Exit");
////            System.out.print("\t\tEnter choice: ");
////            int choice =sc.nextInt();
////
////            switch(choice){
////                case 1: sm.addStudent(); break;
////                case 2: sm.DisplayStudents(); break;
////                case 3:sm.DeleteStudent();break;
////                case 4: sm.TotalStudents();break;
////                case 5: sm.RollnoSort();break;
////                case 6: sm.sortByName();break;
////                case 7:
////                    System.out.println("Exitting!");
////                    return;
////                default:
////                    System.out.println("Invalid Choice!");
////                   return;
////            }
////        }
////    }
////}
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
//public class LinkedListThree {
//    Data head = null;
//    Scanner sc=new Scanner(System.in);
//    public void append(){
//
//        System.out.print("Enter the data:");
//        int data=sc.nextInt();
//        Data newData = new Data(data);
//        Data temp =head;
//        while(temp.next!= null){
//            temp = temp.next;
//        }
//        temp.next=newData;
//    }
//
//    public void Display(){
//        if(head==null) System.out.println("Empty list");
//        else{
//            Data temp=head;
//            while(temp != null){
//                System.out.print(temp.data);
//                temp=temp.next;
//                System.out.print(" -> ");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        LinkedListThree list = new LinkedListThree();
//        while (true){
//            System.out.print("Enter choice:");
//            int choice=sc.nextInt();
//
//            switch (choice){
//                case 1:
//                    list.append();break;
//                case 2:
//                    list.Display();break;
//                case 3:
//                    return;
//            }
//        }
//    }
//}