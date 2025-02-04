import java.util.Scanner;
class LargestDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int last_digit = 0;
        while (n > 0){
            int digit = n%10;
            if(digit > last_digit){
                last_digit = digit;
                
            }
            n/=10; 
        } 
        System.out.println(last_digit);
    }
}