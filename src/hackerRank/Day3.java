package hackerRank;
import java.util.Scanner;

public class Day3 {
	private static final Scanner sc = new Scanner(System.in);

	/*Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.*/
	
	public static void main(String[] args) {
		System.out.println("Insert a number");
		int N = sc.nextInt();
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String Result ="Weird";
        if(2<=N&&N<=5){
            Result = "Not Weird";
        }else if(20<N){
            Result = "Not Weird";
        }

        Result = ((N%2)==1)? "Weird" : Result;
        
        System.out.println("Number "+N +" is " +Result);

        sc.close();

	}

}
