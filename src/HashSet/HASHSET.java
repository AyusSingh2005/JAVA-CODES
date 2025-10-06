//import java.util.*;
//public class HASHSET {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        HashSet<Integer> numbers = new HashSet<>();
//       int choice=0;
//        System.out.println("1 to enter Element || 2 to Display all elements || 3  getSize ");
//        while(true){
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//            switch(choice){
//                case 1:
//                        System.out.print("Enter element:");
//                        int val=sc.nextInt();
//                        numbers.add(val);
//                    break;
//                case 2:
//                    for(int num : numbers){
//                        System.out.print(List.of(num));
//
//                    }
//                    System.out.println();
//                    break;
//                case 3:
//                    System.out.println("The size is:"+numbers.size());
//                    break;
//                case 4:return;
//            }
//        }
//    }
//}
//


//import java.util.*;
//public class HASHSET {
//    public static void main(String[] args) {
//        HashSet<String> set1 = new HashSet<>();
//        set1.add("APPLE");
//        set1.add("Banana");
//        set1.add("Banana");
//        set1.add("Orange");
//        set1.add("Mango");
//        System.out.print(Arrays.asList(set1));
//        System.out.println();
//        System.out.println("Does set1 contains 'Apple'"+set1.contains("APPLE"));
//        System.out.println("Does set1 contains 'Grapes?'"+set1.contains("Grapes"));
//        set1.remove("Orange");
//        System.out.println("Size of set 1 is: "+set1.size());
//
//        HashSet<String>names = new HashSet<>();
//        names.add("Ayush");
//        names.add("Babita");
//        names.add("Gaurav");
//        names.add("Priyansh");
//        names.add("APPLE");
//        set1.addAll(names);
//        System.out.println(List.of(set1));
//        HashSet<String>intersection = new HashSet<>(set1);
//        intersection.retainAll(names);
//        System.out.println("Intersection "+ intersection);
//    }
//}