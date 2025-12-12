class Solution {
    public int findPeakElement(int[] arr) {

        int start  = 0;
        int end = arr.length - 1;
        int mid = start + (end - start)/2;
        
        while(start < end){
            if(mid < arr.length-1 && arr[mid+1] > arr[mid]){
                start = mid + 1;
            }else{
                end = mid;
            }

            mid = start + (end - start)/2;
        }
        
        return mid;
    }
}