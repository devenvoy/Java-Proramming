package stringss;
// reverse every word of string and return answer
// input :my name is devansh
// output:ym eman si hsnaved
import java.util.Scanner;

public class word_rev_s {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        StringBuilder str1 = new StringBuilder();
        str.append(" ");
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                str1.append(str.charAt(i));
            } else {
                str1.reverse();
                System.out.print(str1+" ");
                str1.delete(0,str1.length()); // str1 = new StringBuilder("");
            }
        }
    }
}
