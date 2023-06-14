import java.util.Random;


class dice{

    public static void main(String[] args){

    Random rand = new Random();
    int a=rand.nextInt(6);
    int b=rand.nextInt(6);

  
    System.out.println("Rolling dice");

    System.out.println("Die 1 :" + a );
    System.out.println("Die 2 :" + b );
    int c=(a+b);
    System.out.println("Total value:" + c);  
}  
}