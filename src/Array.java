//import java.util.*;
//class Array{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("\nEnter the size of the array: ");
//        int n = sc.nextInt();
//
//        int[]arr= new int[n];
//
//
//        System.out.println("\nTaking the elements of the array!\n");
//
//        for(int i=0;i<n;i++){
//            System.out.print("Enter the element at  index no:"+ i+" :");
//            arr[i]=sc.nextInt();
//        }

                     //TO PRINT THE ARRAY


//        System.out.println("Printing the taken Array Elements");
//        for (int i=0;i<n;i++){
//            System.out.println("Element number: "+i+1 +"is : "+arr[i]);
//        }


                    //THIS IS THE BLOCK OF CODE TO GET MAX ELEMENT|

//        int Max=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]> Max){
//                Max = arr[i];
//            }
//
//        }
//        System.out.println("\n\nThe largest element of the array is: "+ Max);



                        //THIS IS THE BLOCK OF CODE TO GET MIN ELEMENT|


//        int min=arr[0];
//        for(int i=0;i<arr.length;i++){
//
//            if(min>arr[i]){
//                min = arr[i];
//            }
//
//        }
//        System.out.println("\n\n\tMinimum element value is: "+min);



                             //THIS IS THE BLOCK OF CODE TO GET ADD OF TOTAL  ELEMENT|

//        int add =0;
//        for(int i=0;i<arr.length;i++){
//            add=add+arr[i];
//        }
//
//        System.out.println("ADDITION OF THE ELEMENTS IS:"+add);



                            //TO REVERSE AN ARRAY

//        System.out.println("\n\n\tReversed ARRAY!");
//        for(int i=arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }



                            //TO FIN THE AVG OF THE TOTAL ELEMENTS OF ARRAY


//        int add=0;
//        for(int i=0;i<arr.length;i++){
//           add=add+arr[i];
//       }
//        double avg = add/arr.length;
//        System.out.println("THE AVG IS: "+avg);



                //TO FIND THE SPECIFIC ELEMENT IN THE ARRAY
//        System.out.print("\nEnter the target to Search: ");
//        int target=sc.nextInt();
//        boolean found = false;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target){
//                System.out.println("THE TARGET IS FOUND AT INDEX "+i);
//                found=true;
//                break;
//            }
//        }
//        if(!found){
//            System.out.println("NOT FOUND!!");
//        }


        //To delete any specific element of index and replace new element of the pos UserInput

//        System.out.println("Enter the element to delete from array: ");
//        int oldElement=sc.nextInt();
//        System.out.println("Enter the NewElement to insert: ");
//        int newElement=sc.nextInt();
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==oldElement){
//                arr[i]=newElement;
//            }
//        }
//        System.out.print("Printing the array after change:");
//
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//
//        }
//        System.out.println("\n");



//    }
//}

//import java.util.Arrays;
//
//public class Array {
//    static void main(String []args) {
//        int[] arr={1,2,3,4};
//        arr[4]=0;
//        System.out.println(Arrays.toString(arr));
//
//    }
//}


//import java.util.*;
//public class Array {
//   public static void main(String []args) {
//        Scanner sc=new Scanner (System.in);
//        //initialising array here
//        int [][]arr={
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//    //storing demand & supply here
//        int []supply={20,30,50};
//        int []demand={50,20,30};
//
//        // the printing of supply on the side of the table/mattrix
//       System.out.println();
//       System.out.println("\t\t\t\t\t\t   Supply");
//
//       // the printing of the matrix starts here
//        for(int i=0;i<3;i++){
//            System.out.print("\t\t\t[ ");
//            for(int j=0;j<3;j++){
//                System.out.print( arr[i][j] + "  ");
//            }
//            System.out.print(" ]");
//            System.out.print("\t"+supply[i]);
//            System.out.println();
//        }
//       System.out.print("  Demand   ");
//       for(int i=0;i< demand.length;i++){
//
//           System.out.print(" "+demand[i]+" ");
//       }
//
//       // the prinitng of the mattrix table with supply & demand ends here
//
//
////      now adding the total of the demand to check / give condition later
//       int sum=0;
//
//       for(int i=0;i< demand.length;i++){
//           sum=sum+demand[i];
//       }
//       //      now adding the total of the supply to check / give condition later
//       int sum2=0;
//       for(int i=0;i<supply.length;i++){
//           sum2=sum2+supply[i];
//       }
//
//       //main block of the logical operation starts here dude!
//
//
//    }
//}

//import java.util.*;
//public class Array {
//    public static int BinarySearch(int[]arr, int target){
//        int start=0,end=arr.length-1;
//
//        while(start<end){
//            int mid =(start + end)/ 2;
//
//            if(arr[mid]==target){
//                return mid;
//            }
//            if(arr[mid]<=target){
//                start=end + 1;
//
//            }
//            else{
//                start = end -1;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//
//        int[]arr={12,34,34,5,3,3,24,5,3,244,4};
//        System.out.print("Enter the target element: ");
//        int target=sc.nextInt();
//        int result= BinarySearch(arr, target);
//
//        if(result == -1){
//            System.out.println("-1");
//        }else{
//            System.out.println("Element found at index: "+result);
//        }
//    }
//}



