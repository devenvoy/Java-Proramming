package Std_XII;

// Introduction to array
public class U9_2 {
    public static void main(String[] args) {

        // Syntax to declare an array
        // you need to specify the size of array after new keyword with its data type
        int[] mark1 = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Marks,["+(i+1)+"] is "+mark1[i]);
        }
        System.out.println();

        // Initialize an Array while declaring
        int[] mark2 = new int[3];
        // if you're initializing an array, no need to define the size of array
        int[] mark3 = {50,60,70};
        int[] mark4 = {70,80,90};

        System.out.print("Array mark1:\t"); display(mark1,3);
        System.out.print("Array mark2:\t"); display(mark2,3);
        System.out.print("Array mark3:\t"); display(mark3,3);
        System.out.print("Array mark3:\t"); display(mark4,3);
    }

    static void display(int[] arr , int size){
        for(int i = 0; i<size;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
