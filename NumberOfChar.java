import java.util.*;
public class NumberOfChar {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char str;
        int charCount = 0;
        int numCount = 0;
        int specialCharCount = 0;
        int whiteSpaceCount = 0;
        while (true) {
             str = sc.next().charAt(0);
             sc.close();
             for (int i = 0; i < 1; i++) {
                
                if (str == ' ') {
                    whiteSpaceCount++;
                }
                if (str >= '0' || str <= '9') {
                    numCount++;
                    
                }
                if (str >= 'a' && str <= 'z' || str >= 'A' && str <= 'Z') {
                    charCount++;
                }
                if (str == '!' || str == '@' || str == '#' || str == '$' || str == '%' || str == '^' || str == '*' || str == '(' || str == ')' || str == '-' || str == '_' || str == '+' || str == '=' || str == '{' || str == '}' || str == '[' || str == ']' || str == ':' || str == ';' || str == '"' || str == '\'' || str == '<' || str == '>' || str == ',' || str == '.' || str == '?' ) {
                    specialCharCount++;
                }
                if (str == '&') {
                    break;
                }
            }
            
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of digits: " + numCount);
            System.out.println("Number of special characters: " + specialCharCount);
            System.out.println("Number of white spaces: " + whiteSpaceCount);
        }

       
           
            
    }
}
