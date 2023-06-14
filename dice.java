import java.util.Random;
import java.util.Scanner;


class dice{

    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

    Random rand = new Random();
    int a=rand.nextInt(6);
    int b=rand.nextInt(6);

    System.out.println("What is your name? ");
    System.out.print(">");
    	String name=scanner.nextLine();
	System.out.println("Hello, "+name+"!");
  
    System.out.println("Rolling dice");

    System.out.println("Die 1 :" + a );
    System.out.println("Die 2 :" + b );
    int c=(a+b);
    System.out.println("Total value:" + c);
    if(c>=7){
	System.out.println("you won");
    }
    else{
       	System.out.println("you lost");
    }
}  
}
