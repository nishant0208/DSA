class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder ans=new StringBuilder();
        // Char ansarray[]=new Char[indices.length];
        for( int i=0;i<indices.length;i++){
         for(int j=0;j<indices.length;j++){
            if(i==indices[j]){
                ans.append(s.charAt(j));
                // ansarray[i]==s.charAt(j);
            }
         }
        }
        return ans.toString();
    }
}
