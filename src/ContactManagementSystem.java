//import java.util.*;
//class Contact{
//    String name;
//    String phone;
//    Contact next;
//
//    public Contact(String name,String phone){
//        this.name = name;
//        this.phone = phone;
//        this.next = null;
//    }
//}
//
//class ContactList{
//    private Contact head;
//
//    public void addContact(String name, String phone){
//        Contact newContact  =new Contact(name,phone);
//
//        if(head == null){
//            head = newContact;
//        }else{
//            Contact temp = head;
//
//            while(temp.next != null){
//                temp = temp.next;
//            }
//            temp.next=newContact;
//        }
//        System.out.println("Contact added Successfully!");
//    }
//
//    public void displayContact(){
//        if(head == null){
//            System.out.println("No contact found!!");
//        }
//        Contact temp = head;
//        System.out.println("\t------Contact List-----");
//
//        while(temp != null){
//            System.out.println("Name: "+temp.name);
//            System.out.println("Contact: "+ temp.phone);
//            System.out.println("----------------------");
//            temp = temp.next;
//        }
//    }
//
//    public void searchContact(String name){
//        Contact temp = head;
//        while(temp != null){
//            if(temp.name.equalsIgnoreCase(name)){
//                System.out.println("Contact Found!");
//                System.out.println("Name: "+temp.name);
//                System.out.println("Contact: "+temp.phone);
//                return;
//            }
//            temp = temp.next;
//        }
//        System.out.println("Contact Dose Not Exists");
//    }
//
//    public void deleteContact(String name){
//        if(head == null){
//            System.out.println("No contacts to delete");
//            return;
//        }
//
//        if(head.name.equalsIgnoreCase(name)){
//            head = head.next;
//            System.out.println("Contact Deleted successfully!!");
//            return;
//        }
//        Contact temp = head;
//
//        while(temp.next!= null && !temp.next.name.equalsIgnoreCase(name)){
//            temp = temp.next;
//        }
//
//        if(temp.next == null){
//            System.out.println("Contact not found!");
//        }else{
//            temp.next=temp.next.next;
//            System.out.println("Contact delted successfully");
//        }
//    }
//
//    public void countContact(){
//        int count = 0;
//        Contact temp = head;
//        while(temp != null){
//            count++;
//            temp=temp.next;
//
//        }
//        System.out.println("Total Contacts: "+ count);
//    }
//}
//
//public class ContactManagementSystem {
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        ContactList cl = new ContactList();
//
//        while(true){
//            System.out.println("\n===== Contact Management System =====");
//            System.out.println("1. Add Contact || 2.Display Contacts|| 3.Search Contact");
//            System.out.println("\t4. Delete Contact ||5. Count Contacts || 6. Exit");
//            System.out.print("\nChoose an option: ");
//            int choice=sc.nextInt();
//            sc.nextLine();
//
//            switch (choice){
//                case 1:
//                   int more =1;
//
//                   while(more ==1){
//                       System.out.print("Enter name: ");
//                       String name = sc.nextLine();
//                       System.out.print("Enter the contact No: ");
//                       String phone = sc.nextLine();
//                       cl.addContact(name,phone);
//
//                       while(true){
//                           System.out.print("Want to add more  (yes 1 || no 0)");
//                           if(sc.hasNextInt()){
//                               more = sc.nextInt();
//                               sc.nextLine();
//                               if(more ==1|| more == 0){
//                                   break;
//                               }else{
//                                   System.out.println("❌ Invalid choice! Enter only 1 or 0.");
//                               }
//                           }else{
//                               System.out.println("❌ Invalid choice! Enter only 1 or 0.");
//                               sc.next();
//                           }
//
//                       }
//
//                   }
//                    break;
//
//
//
//
//                case 2: cl.displayContact(); break;
//                case 3:
//                    System.out.print("Enter the name to search: ");
//                    String searchName=sc.nextLine();
//                    cl.searchContact(searchName);
//                    break;
//
//                case 4:
//                    System.out.print("Enter the name to delete: ");
//                    String deleteName = sc.nextLine();
//                    cl.deleteContact(deleteName); break;
//
//                case 5:cl.countContact(); break;
//
//                case 6:
//                    System.out.println("Exitting.....");
//                    sc.close();
//                    return;
//
//                default:
//                    System.out.println("Invalid Choice!");
//
//            }
//        }
//    }
//}