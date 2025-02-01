import java.util.Scanner;
class Float{
    public  static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A:");
        double A = sc.nextDouble();
        System.out.println("Enter the number B:");
        double B = sc.nextDouble();

        A  = Math.round(A*1000.0)/1000.0;
        B  = Math.round(B*1000.0)/1000.0;

        if(A>B){
            System.out.println("A is greater");
        }
        else if(A<B){
            System.out.println("B is greater");
        }
        else {
            System.out.println("Both are equal");
        }

    }
}
