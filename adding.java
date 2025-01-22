import java.util.Scanner;
class adding {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the adding number");
      
        int a = sc.nextInt();
        int b = sc.nextInt(); 
      
        System.out.println("Sum of the two number");
        int sum = a+b;
        System.out.println(sum);
    }
}
