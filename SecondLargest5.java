/* you are given an integer array A .
you have to find the second largest element/value in the array or report that no such element exists. */

class SecondLargest{
    public static void main(String[] args){
        int[] arr = {3, 5, 2, 5, 1};
        int max = arr[0];
        for (int i = 1; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];

            }
        }}
        int secondMax = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > secondMax && arr[i]) != max {
                secondMax = arr[i];
            }

        }
        if (secondMax == Integer.MIN_VALUE){
            System.out.println("No second largest element exists");
        } else {
            System.out.println("Second largest element is: " + secondMax);
        }
    }
