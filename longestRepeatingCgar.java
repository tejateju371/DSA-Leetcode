class Solution {
    public int characterReplacement(String s, int k) {
       int length= s.length();
       char arr[]=s.toCharArray();
       int count=0;
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
        if(arr[i]=='B'){
            count++;
        }
       }
     return count+k;
    
    }
    }