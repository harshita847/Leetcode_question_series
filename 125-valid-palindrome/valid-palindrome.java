  class Solution {
      public boolean isPalindrome(String s) {
          int lo = 0;
          int hi = s.length() - 1;
                                                                                                                        
          while (lo < hi) {
              // Skip non-alphanumeric from left                                                                        
              while (lo < hi && !Character.isLetterOrDigit(s.charAt(lo))) lo++;
                                                                                                                        
              // Skip non-alphanumeric from right
              while (lo < hi && !Character.isLetterOrDigit(s.charAt(hi))) hi--;                                         
                  
              // Compare (case-insensitive)                                                                             
              if (Character.toLowerCase(s.charAt(lo)) != Character.toLowerCase(s.charAt(hi))) {
                  return false;  // Mismatch found → not a palindrome                                                   
              }                                                                                                         
   
              // Both matched → move inward                                                                             
              lo++;
              hi--;
          }
          // All characters matched → palindrome!
          return true;                                                                                                  
      }
  }   