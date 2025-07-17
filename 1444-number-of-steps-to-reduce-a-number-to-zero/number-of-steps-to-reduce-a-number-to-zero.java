class Solution {
    int k=0;
    public int numberOfSteps(int num) {
        if(num==0)
        return 0;
        if(num%2==0){
        num=num/2;
        k++;
        }
        else {
        num--;
        k++;
        }
         numberOfSteps(num);
         return k;
        
    }
}