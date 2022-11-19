public class Main {
    public static void main(String[] args)
    {
        int[] Array = {5,2,7,23,12,11,15,96,23,43,29,48,32,88,70};

        // Print semua data array
        System.out.print("Data Array : ");
        for(int i=0; i < Array.length; i++)
        {
            System.out.print(Array[i]+" ");
        }

        System.out.println(" ");
        // Menentukan bilangan genap
        System.out.print("Bilangan genap : ");
        for(int i=0; i < Array.length;i++)
        {
            if( Array[i] % 2 == 0)
            {
                System.out.print(Array[i]+" ");
            }
        }

        System.out.println(" ");
        // Menentukan bilangan ganjil
        System.out.print("Bilangan ganjil :");
        for(int i=0; i < Array.length;i++)
        {
            if( Array[i] % 2 != 0)
            {
                System.out.print(Array[i]+" ");
            }
        }
    }
}