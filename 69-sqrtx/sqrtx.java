class Solution {
    public int mySqrt(int x) {
        long start=0;
        long end = x;
        long mid=-1;
       while(start<=end){
        mid=start+(end-start)/2;
        if(mid*mid ==(long)x){
            return(int)Math.round(mid);
        }
        else
        if(mid*mid<(long)x)
        {
            start=mid+1;
        }
        else 
        {
            end=mid-1;
        }
       }
        return (int)Math.round(end);
    }
}