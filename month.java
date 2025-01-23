import java.util.Scanner;
class month{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a Month:");
        int a = sc.nextInt();

        if(a >= 3 && a <= 5){
            System.out.println("Spring Season");
        }else if ( a >= 6 && a <= 8){
            System.out.println("Summer Season");
        }else if ( a >= 9 && a <= 11){
            System.out.println("autumn season");
        }else if ( a == 12 || a == 1 || a == 2 ){
            System.out.println("winter season");
        }else {
            System.out.println("Enter the month in 1 to 12");
        }
    }
}