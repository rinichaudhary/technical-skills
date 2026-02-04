
/*QUES2:- Given an integer array of size n in one second you can increase the value of one element by 1.
find the minimum time in seconds to make all the elements of the array equal 
 */
/*Observation:-  to minimize time make all elements equal to the maximum of the array  */
/* pseudocode:
1. find the max of the array.
2. for every element calculate how much it neends to be increase to reach the maximum .
3. sum of all those differences . */

class ArrayIncreaseBy1 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int n = A.length;

        int max = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        int time = 0;
        for (int i = 0; i < n; i++) {
            time = time + (max - A[i]);
        }
        System.out.println("Minimum time : " + time + " seconds");
    }
}

