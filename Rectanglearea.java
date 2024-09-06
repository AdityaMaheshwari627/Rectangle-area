//Area of Rectangle
package Numbers;

import java.util.Scanner;

public class Rectanglearea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Length:");
        int length=obj.nextInt();
        System.out.print("Enter width:");
        int width=obj.nextInt();
        System.out.print("Area of rectangle is "+(length*width));
	}

}
