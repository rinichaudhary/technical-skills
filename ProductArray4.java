/*given an array of integer A find and return the product array of the same size where the ith element of the 
product array will be equal to the product of all elements divided by the ith element of the array */

import java.util.Scanner;

public class ProductArray4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] product = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        // calculate total product
        int totalProduct = 1;
        for (int i = 0; i < n; i++) {
            totalProduct *= A[i];
        }

        // create product array
        for (int i = 0; i < n; i++) {
            product[i] = totalProduct / A[i];
        }

        System.out.println("Product array:");
        for (int i = 0; i < n; i++) {
            System.out.print(product[i] + " ");
        }

        sc.close();
    }
}