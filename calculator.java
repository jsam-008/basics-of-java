import java.util.Scanner;
class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number for A = ");
        double a = sc.nextDouble();
        System.out.println("Enter number for B = ");
        double b = sc.nextDouble();

        System.out.println("1.addiction");
        System.out.println("2.subtraction");
        System.out.println("5.multiplication");
        System.out.println("4.division");

        System.out.println("Enter the choice");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
              System.out.println("Addiction");
              System.out.println(a+ " + " +b+ " = " +(a+b));
                break;
            case 2:
              System.out.println("subtraction");
              System.out.println(a+ " - " +b+ " = " +(a-b));
                break;
            case 3:
              System.out.println("Multiplication");
              System.out.println(a+ " * " +b+ " = " +(a*b));
                break;
            case 4:
              System.out.println("Division");
            if(b == 0){
                System.out.println("The zero cannot divided");
            }else{
                System.out.println(a+ " / " +b+ " = " +(a/b));
            }
            default:
              System.out.println("Enter the number in choies list");
                break;
        }

    }
    
}
