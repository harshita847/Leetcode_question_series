class Solution {
    public int countDigits(int num) {
        int num2=num;
        int count=0;
        while(num2!=0){
              int a=num2%10;
              if(num%a==0){
                count++;
              }
              num2=num2/10;
              
        }
        
       return count; 
    }
}