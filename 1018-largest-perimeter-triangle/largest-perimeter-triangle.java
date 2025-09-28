class Solution {
    public int largestPerimeter(int[] arr) {
                int n = arr.length;

        // sort the array in descending order
        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        // loop through the array
        for (int i = 0; i < n - 2; i++) {

            // check if the three sides can 
            // form a triangle or not
            if (arr[i] < arr[i + 1] + arr[i + 2]) {
                return arr[i] + arr[i + 1] + arr[i + 2];
            }
        }

        return 0;
    }
}