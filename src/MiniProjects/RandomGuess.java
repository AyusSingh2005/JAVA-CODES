//package MiniProjects;
//import java.util.*;
//public class RandomGuess {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println("The random guessing game starts now!!");
//        System.out.println("Guess the number btween 1-10");
//        int userchoice=0,target = -2;
//        int attempt=0;
//        while(target != userchoice){
//            if(userchoice<0 ||userchoice>10){
//                System.out.println("Enter a valid number");
//            }
//            if(attempt==5){
//                System.out.println("YOU LOSE");return;
//            }
//            target=random.nextInt(1,10);
//            attempt++;
//            System.out.print("Your Guess: ");
//            userchoice=sc.nextInt();
//            System.out.println("Thenumber was: "+ target);
//        }
//        System.out.println("conratulations you took "+ attempt+" attempts");
//    }
//}