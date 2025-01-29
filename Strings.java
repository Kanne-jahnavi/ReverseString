import java.util.Scanner;
public class Strings{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a String:");
        String input=scanner.nextLine();
        String reversed= reversestring(input);
    }
    public static String reversestring(String str){
        StringBuilder reversed=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}