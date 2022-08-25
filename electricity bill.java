import java.util.*;
class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
        int units = scn.nextInt();
        int bill;
        
        if (units <= 50) {
            bill = units;
        }
        else if (units <= 150) {
            bill = (50 + ((units - 50)*2));
        }
        else if (units <= 250) {
            bill = (250 + ((units - 150)*3));
        }
        else {
            bill = (550 + ((units - 250)*5));
        }
        System.out.println(bill);
        // Your code goes here
	}
}