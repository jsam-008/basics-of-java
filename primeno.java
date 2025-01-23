import java.util.Scanner;
class primeno {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number:");

    int num = sc.nextInt();

    if ( num == 1 || num == 0){
        System.out.println("This number is not prime:" +num);
    }else{
        boolean a = true ;
         for (int i=2 ; i<= num/2 ; i++ ){
            if ( num % i == 0 ){
                a = false;
            }
         }
         if (a){
            System.out.println("This number is prime:"+num);
         }else{
            System.out.println("This number not is prime:"+num);
         }
        
         }
    }
}
