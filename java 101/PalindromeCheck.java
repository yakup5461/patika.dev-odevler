import java.util.Scanner;

public class PalindromeCheck {


static boolean isPalindrome1(String str) {
    String reverse = "";
    for (int i = str.length() - 1; i >= 0; i--) {
        reverse += str.charAt(i);
    }

    if (str.equals(reverse))
        return true;
    else
        return false;
}
/*static boolean isPalindrome2(String str) {
int i = 0, j = str.length() - 1;
while (i < j) {
    if (str.charAt(i) != str.charAt(j))
        return false;
    i++;
    j--;
}
return true;
}*/
public static void main(String[] args) {
	String str;
    System.out.println("Palindrom kontrolü yapılacak kelimeyi giriniz :");
    Scanner scn = new Scanner(System.in);
    str=scn.nextLine();
    scn.close();
    if(isPalindrome1(str)) {System.out.println(str+"\t kelimesi palindromdur.");}
    else {System.out.println(str+"\t kelimesi palindrom değildir.");}
    
	}//main kapama
}//class kapama