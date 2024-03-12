package OldPaperAns;
// need to be imported
import java.util.Arrays;


// command line input
//dev prince riya aditya karan ram manan
public class sortStrFromCmd {
    public static void main(String[] args) {

        Arrays.sort(args);

        for (String str : args) {
            System.out.println(str);
        }
    }
}
