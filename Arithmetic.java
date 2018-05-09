import java.util.*;//Scanner;

class Arithmetic{
 	public static void main(String[] args){
     	int a,b,c,d;double e,f,g;
     	System.out.println("e,f,g: ");
 		e=(15/2)+(30/3)-(5*2)+(3-2);
 		f=15%3/5;
 		g=7-3+40%4*25/5;
 		System.out.println("e:"+e+" f: "+f+" g: "+g);
     	System.out.println("Please enter four integers:");
     	Scanner input = new Scanner(System.in);
     	a = input.nextInt();
     	b = input.nextInt();
     	c = input.nextInt();
     	d = input.nextInt();
     	System.out.println("The sum of a+b is: "+(a+b));
     	System.out.println("The difference of a-b is: "+(a-b));
     	System.out.println("The multiple of a*b is: "+(a*b));
     	System.out.println("The quotient of a/b is: "+(a/b));
     	System.out.println("The remainder is: "+(a%b));
     	System.out.println("Here is (a-b)*(c+d): "+(a-b)*(c+d)+"\nThank You!");
 	}	
}