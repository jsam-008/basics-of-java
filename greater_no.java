import java.util.Scanner;
class greater_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        if (a>50){
            System.out.println("greater then 50");
        }
        else if (a >= 40 && a <= 50){
            System.out.println("its between the 40 to 50");
        }
        else if(a<40){
            System.out.println("less then 40");
        }
        else {
             System.out.println(" ple enter the numbers");
        }
    }
}
