import java.util.Scanner;
public class Main{


    public static void main(String []args){


        Scanner input = new Scanner(System.in);
        int n = 10;
        int[] array = new int[n];
        System.out.println("Input nilai array :");

        for (int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }

        System.out.println();
        System.out.printf("\nBubble absen genap : ");

        bSort(array);
        for (int j = 0; j < n; j ++)
            if(array[j] % 2 == 0){
                System.out.printf("%s ", array[j]);
            }
        System.out.printf("\n \n");
    }
    static void bSort(int array[]){
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++){
            for (int j = 1; j < n; j++){
                if (array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}