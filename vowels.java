import java.util.Scanner;
class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter character: ");
        char c  = sc.next().charAt(0);

        if ( c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'||
             c == 'A'||c == 'E'||c == 'I'||c == 'O'||c == 'U' ){
            System.out.println("This is vowels = "+c);
        }
        else{
            System.out.println("This is consonants = "+c);
        }
    }
    
}
