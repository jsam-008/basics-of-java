import java.util.Scanner;
class age_group {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");

        int age = sc.nextInt();

        if( age >= 0 && age <= 12){
            System.out.println("Child");
        }else if( age >=13 && age <=19 ){
            System.out.println("Teenage");
        }else if( age >=20 && age <=64 ){
            System.out.println("Abult");
        }else if( age >= 65 ){
            System.out.println("senior");
        }else{
            System.out.println("Enter your crt age");
        }
    }
     
}
