import java.util.*;


public class Test {
    public static void main(String[] args) {
        String str = "afefhtioiust";
        int count = 0;
        for(int i= 0; i<str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.print(count);
    }
}


