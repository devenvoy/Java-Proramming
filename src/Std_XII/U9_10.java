package Std_XII;

// Creating And Initializing 2-D Array
public class U9_10 {
    public static void main(String[] args) {

        int[][] mark1;
        mark1 = new int[5][3];

        int[][] mark2 = new int[5][3];

        int mark3[][] = new int[5][3];

        int[][] mark4 = {{50, 60, 70}, {35, 30, 50},
                {70, 75, 80}, {80, 85, 90},
                {50, 50, 55}};

        System.out.println("Displaying 2-D Array mark1 :");
        display(mark1, 5, 3);
        System.out.println("Displaying 2-D Array mark2 :");
        display(mark2, 5, 3);
        System.out.println("Displaying 2-D Array mark3 :");
        display(mark3, 5, 3);
        System.out.println("Displaying 2-D Array mark4 :");
        display(mark4, 5, 3);

    }

    private static void display(int[][] mark, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mark[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
