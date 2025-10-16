

                //Expected output arr[30,40,20,50,10,60];
      //    import java.util.*;      //ARRAY PROBLEM 1
//public class ArrayProblem {
//    public static void main(String[] args) {
//        int[] arr = {10,20,30,40,50,60};
//
//        int [] A= new int[3];
//        for(int i=0;i<arr.length/2;i++){
//            A[i]=arr[i];
//
//        }
//        int[] RA=new int [3];
//        for(int i=0;i<3;i++){
//            RA[i]=A[2 - i];
//           System.out.println(RA[i]);
//        }
//
//        int [] B = new int [3];
//        for(int i=0;i<3;i++){
//            B[i]=arr[i + 3];
//            // System.out.println(B[i]);
//        }
//        int [] result = new int[6];
//        int k=0;
//
//        for(int i=0;i<3;i++){
//            result[k++]=RA[i];
//            result[k++]=B[i];
//        }
//        System.out.println(Arrays.toString(result));
//
//    }
//}

//
//public class ArrayProblem {
//    public static void main(String[]args){
//        //PROBLEM IS: {1,2,3,4,5,6} → {4,5,6,1,2,3}
//        int [] arr={1,2,3,4,5,6};
//        int []A = new int[3];
//        for(int i=0;i<3;i++){
//            A[i]= arr[i + 3];
//        }
//        int [] B= new int[3];
//        for(int i=0;i<3;i++){
//            B[i]=arr[i];
//        }
//     int [] result = new int [6];
//        for(int i=0;i<A.length;i++){
//            result[i]= A[i];
//        }
//        for(int i=0;i<B.length;i++){
//            result[i +3 ]=B[i];
//        }
//        System.out.println(Arrays.toString(result));
//    }
//}




                   // OUTPUT  {10,20,30,40,50,60}, k=2 → {20,10,40,30,60,50}
                    //ARRAY PROBLEM 2
//public class ArrayProblem{
//    public static void main(String[]args){
//
//
//        int[]arr={10,20,30,40,50,60};
//        int[] r1 = new int [2];
//        int[] r2 = new int[2];
//        int []r3= new int[2];
//
//        for(int i=0;i<2;i++){
//            r1[i]=arr[ 1 - i];
//            r2[i]=arr[3 - i];
//            r3[i]=arr[5 - i];
//
//        }
//        System.out.println(r1[0]+ " "+ r1[1]);
//        System.out.println(r2[0]+ " "+ r2[1]);
//        System.out.println(r3[0]+ " "+ r3[1]);
//
//        int [] result = new int[6];
//        for(int i=0;i<2;i++){
//            result[i]=r1[i];
//            result[i + 2]= r2[i];
//            result[i + 4]=r3[i];
//        }
//        System.out.println(Arrays.toString(result));
//    }
//}

                //ARRAY PROBLEM 3
                // Merge two arrays alternately. Example: A={1,3,5}, B={2,4,6} → {1,2,3,4,5,6}
//        import java.util.*;
//                public class ArrayProblem{
//    public static void main(String[]args){
//        int[]A={1,3,5};
//        int[]B={2,4,6};
//        int [] result=new int [6];
//        int count=0;
//        for(int i=0;i<3;i++){
//            result[count++]=A[i];
//            result[count++]=B[i];
//        }
//        System.out.println(Arrays.toString(result));
//    }
//  }



//  {1,2,3,4,5,6} → {3,2,1,4,5,6}
                //ARRAY PROBLEM 4
//import java.util.*;
//public class ArrayProblem {
//    public static void main(String[]args){
//        int[]arr={1,2,3,4,5,6};
//        int []A = new int[3];
//        int []RA = new int[3];
//        int []B = new int [3];
//
//        for(int i=0;i<3;i++){
//            A[i]=arr[i];
//        }
//        for(int i = 0;i< 3;i++){
//            RA[i]=A[2 - i];
//        }
//     for(int i=0;i<3;i++){
//         B[i]=arr[i + 3];
//     }
//     int[]result = new int[6];
//     int count=0;
//     for(int i=0;i<3;i++){
//         result[i]=RA[i];
//     }
//     for (int i=0;i<3;i++){
//         result[i + 3]=B[i];
//     }
//        System.out.println(Arrays.toString(result));
//    }
//}

                //(first+last, second+secondLast, …). Example: {1,2,3,4} → {5,5}
                    //ARRAY PROBLEM 5

//                import java.util.*;
//public class ArrayProblem {
//    public static void main(String []args){
//        int [] arr={10,20,30,40};
//        int []sum=new int [2];
//        int n=arr[0];
//        sum[0]= arr[0]+arr[3];
//        sum[1]=arr[1]+arr[2];
//        System.out.println(Arrays.toString(sum));
//
//    }
//}

                //ARRAY PROBLEM 6
                //: {1,3,5,-2,-4,-6} → {1,-2,3,-4,5,-6}

//                import java.util.*;
//public class ArrayProblem {
//    public static void main(String[]args){
//        int []arr={1,3,5,-2,-4,-6};
//        int[]arr2=new int[6];
//        int temp=arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(temp<arr[i]){
//                temp=arr[i];
//            }
//        }
//         int []A=new int[3];
//        int []B =new int[3];
//
//        for(int i=0;i<3;i++){
//            A[i]=arr[i];
//        }
//        for(int i=0;i<3;i++){
//            B[i]=arr[i + 3];
//        }
//
//        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(B));
//
//        int [] result = new int[6];
//        int count=0;
//
//        for(int i=0; i<3;i++){
//            result[count++]=A[i];
//            result[count++]=B[i];
//        }
//        System.out.println(Arrays.toString(result));
//    }
//}



               // ARRAY PROBLEM 7

                //. Count frequency of each element in an array.

//                import java.util.*;
//public class ArrayProblem {
//    public static void main(String []args){
//        Scanner sc = new Scanner(System.in);
//        int []arr={10,20,30,40,20,30,10,10,20};
//        int []arr2=new int [9];
//        int temp = arr[0];
//        int frequency1=0; int frequency2=0; int frequency3=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[0]==arr[i]){
//                frequency1++;
//            }
//            if(arr[1]==arr[i]){
//                frequency2++;
//            }
//            if(arr[2]==arr[i]){
//                frequency3++;
//            }
//        }
//        System.out.println(arr[0]+" Has freq "+frequency1);
//        System.out.println(arr[1]+" Has freq "+frequency2);
//        System.out.println(arr[2]+" Has freq "+frequency3);
//    }
//}

               // ARRAY PROBLEM 8

                //Find the second largest element in the array.

//                import java.util.*;
//public class ArrayProblem {
//    public static void main(String[]args){
//        int []arr={12,23,34,5,3,3,243};
//        int max=arr[0];
//        int Smax=arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(max<arr[i]){
//               Smax=max;
//               max=arr[i];
//            }
//        }
//        System.out.println(Smax);
//    }
//}


               // ARRAY PROBLEM 9
                //Find the second SMALLEST element in the array.

//                public class ArrayProblem {
//                    public static void main(String[]args){
//                        int [] arr={12,23,34,5,3,3,243};
//                        int min=arr[0];
//                        int Smin=0;
//
//                        for(int i=0;i<arr.length;i++){
//                            if(min > arr[i]){
//                                Smin = min;
//                                min=arr[i];
//                            }
//                        }
//                        System.out.println(Smin);
//                    }
//}


                //ARRAY PROBLEM 10

                // Remove duplicates from an array.

                //NOT SOLVED
//public class ArrayProblem {
//    public static void main(String[]args){
//        int []arr={10,20,30,40,20,30,10,10,20};
//        int []sortedArr=new int[9];
//        int next=arr[1];
//        int prev=arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(prev==next){
//                prev++;
//                next=sortedArr[i];
//            }
//        }
//        System.out.println(Arrays.toString(sortedArr));
//    }
//}



                //ARRAYPROBLEM 11

//arr=[2,7,11,15] find if there is any permutation to get target=9 in the elements of array

//import java.util.Arrays;
//
//public class Array2 {
//    public static void main(String[] args) {
//        int[] arr = {2, 7, 11, 15};
//        int target = 18;
//        int[] arr2 = new int[2];
//        int prev = arr[0];
//       boolean found = false;
//        for (int i = 0; i < arr.length; i++) {
//            for(int j= i + 1;j<arr.length;j++){
//                if(arr[i] + arr[j] == target){
//                    arr2[0]=arr[i];
//                    arr2[1]=arr[j];
//                    found= true;
//                    break;
//                }
//            }
//            if(found) break;
//
//
//        }
//       if(found){
//           System.out.println(Arrays.toString(arr2));
//           System.out.println("the target is "+ target);
//       }else{
//           System.out.println("Not found!!");
//       }
//
//    }
//}


               // ARRAY PROBLEM 12
//Input: strs = ["flower","flow","flight"]   |Input: strs = ["dog","racecar","car"]
// Output: "fl"                               |       Output: ""


//public class ArrayProblem {
//    public static void main(String[] args) {
//        String[] str={ "flower","flow","flight"};
//        for(int i=0;)
//    }
//}



//                import java.util.*;
//public class ArrayProblem{
//public static void main(String[] args) {
//    int []arr={10,20};
//    int[]arr2=new int [6];
//    for(int i=0;i<arr.length;i++){
//        if(arr[i]<0){
//            arr[i]=0-arr[i];
//        }
//    }
//    System.out.println(Arrays.toString(arr));
//
//}
//        }

//      arr[10,20,30,40,50,60]  ==  [30,40,20,50,10,60]


                //*CODE TO PRINT MATTRIX M X N SIZE WITH INCREMENT NUMBERING 1-N;

//
//                import java.util.*;
//                public class ArrayProblem {
//                    public static void main(String []args) {
//                        Scanner sc = new Scanner(System.in);
//                        int a=1;
//                        System.out.print("Enter the size of rows: ");
//                        int row=sc.nextInt();
//                        System.out.print("Enter the size of columns: ");
//                        int column=sc.nextInt();
//                        for(int i=0;i<row;i++){
//                            for(int j=0;j<column;j++){
//                                System.out.print (a+" ");
//                                a++;
//                            }
//                            System.out.println();
//                        }
//                    }
//                }

//package Arrays;
//import java.util.*;
//public class ArrayProblem {
//
//    public static void main(String[]args){
//        long start = System.nanoTime();
//    int []arr={1,2,3,1,4,2,1,3,1,4,1,2,1,5,6,1,4,1};
//    int n=arr.length-1;Arrays.sort(arr);
//    ArrayList <Integer> arr2 = new ArrayList<>();
//    for(int i=0;i<arr.length;i++){
//        if(i==0 || arr[i]!=arr[i - 1])arr2.add(arr[i]);
//    }System.out.println(arr2);
//   long end= System.nanoTime();
//                long totalTime=end-start;
//                System.out.println("TOTAL TILE TAKEN: "+totalTime/1000000 +" ms");
//                System.out.println("TOTAL TILE TAKEN: "+totalTime/1_000_000_000.0 +" sec");
//0.0023667 sec
//    }
//}


//                package Arrays;
//import java.util.*;
//public class ArrayProblem {
//
//    public static void main(String[]args){
//        long startTime = System.nanoTime();
//    int []arr={1,2,3,1,4,2,1,3,1,4,1,2,1,5,6,1,4,1};Arrays.sort(arr);
//    int frequency=1,currFrequency=1, element=arr[0];
//    for(int i=1;i<arr.length;i++){
//        if(arr[i]==arr[i - 1])currFrequency++;
//        else{ currFrequency=1;}
//            if(currFrequency>frequency)frequency=currFrequency; element=arr[i];
//    }
//    System.out.println("ELEMET IS: "+element+" Frequency is: "+frequency);
//    long endTime=System.nanoTime();
//    long TotalTime = endTime-startTime;
//        System.out.println("TOTAL TILE TAKEN: "+TotalTime/1000000 +" ms");
//        System.out.println("TOTAL TILE TAKEN: "+TotalTime/1_000_000_000.0 +" sec");
//        TOTAL TILE TAKEN: 4 ms
//        TOTAL TILE TAKEN: 0.0045264 sec
//
//    }
//}


