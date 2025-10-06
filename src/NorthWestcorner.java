import java.util.*;
public class NorthWestcorner {
    public static void main(String []args) {
        Scanner sc=new Scanner (System.in);
        //initialising array here
        int [][]arr={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //storing demand & supply here
        int []supply={20,30,50};
        int []demand={50,20,30};

        // the printing of supply on the side of the table/mattrix
        System.out.println();
        System.out.println("\t\t\t\t\t\t   Supply");

        // the printing of the matrix starts here
        for(int i=0;i<3;i++){
            System.out.print("\t\t\t[ ");
            for(int j=0;j<3;j++){
                System.out.print( arr[i][j] + "  ");
            }
            System.out.print(" ]");
            System.out.print("\t"+supply[i]);
            System.out.println();
        }
        System.out.print("  Demand    ");
        for(int i=0;i< demand.length;i++){

            System.out.print(" "+demand[i]+" ");
        }

        // the prinitng of the mattrix table with supply & demand ends here


//      now adding the total of the demand to check / give condition later
        int sum=0;

        for(int i=0;i< demand.length;i++){
            sum=sum+demand[i];
        }
        //      now adding the total of the supply to check / give condition later
        int sum2=0;
        for(int i=0;i<supply.length;i++){
            sum2=sum2+supply[i];
        }

        //main block of the logical operation starts here dude!
    if(sum==sum2){
        //write the main block of the logical code here:


    }
    }
}