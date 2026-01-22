// given an array count no. of array at least one element greater than itself ..

/* step1> for every max elelment there wont be any elelment greater than itself
  then write a pseudocode  */
// step2> iterrate and get the number of elelments which are not equal to max 

class CountElements {
    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 5, 1};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                count++;
            }
        }
        System.out.println("Count = " + count);
    }
}

