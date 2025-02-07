package Problems;

import java.util.*;

public class end_of_file_hr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNextLine()) {
            i += 1;
            System.out.println(i + " " + sc.nextLine());
        }
        sc.close();
    }
}
