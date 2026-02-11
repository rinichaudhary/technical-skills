/*Given an array of integer A find and return the product array of the same size where the Ith 
element of the array will be equal to the product of all elements divided by the Ith element
of the array. */

class ProductArray3{
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4};
        int n = A.length;

        int totalProduct = 1;

        for (int i = 0; i < n; i++) {
            totalProduct = totalProduct * A[i];
        }
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = totalProduct / A[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
