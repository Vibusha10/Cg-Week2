import java.util.Scanner;

class Pallindrome{
    String text;

    Pallindrome(String text){
        this.text  = text;
    }

    public void checkPallindrome(){
        int start = 0;
        int end = text.length() - 1;
        while(start <= end){
            if (text.charAt(start) != text.charAt(end)){
                System.out.println(text + " is not a Pallindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println(text + " is a Palindrome");
    }
}

public class Program3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the text : ");
        String  text = input.nextLine();

        Pallindrome pall = new Pallindrome(text);
        pall.checkPallindrome();
    }
}