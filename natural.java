import java.util.Scanner;
class natural {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int sum = (a*(a+1))/2;
        System.out.println(sum);
    }
}
