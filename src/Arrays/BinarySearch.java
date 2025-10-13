//package Arrays;
//import java.util.*;
//
//public class BinarySearch {
//    public static void main(String[]args){
//        int []arr={5,7,6,12,10,15,9};
//        Arrays.sort(arr);
//        int st =0, end = arr.length-1, target=10;
//        while(st <= target) {
//            int mid = (st + end) / 2;
//            if (arr[mid]==target){
//                System.out.println("found!!");
//                return;
//            }else if(arr[mid]<target){
//                st =mid +1;
//            }else{
//                end=mid-1;
//            }
//
//
//        }
//    }
//}