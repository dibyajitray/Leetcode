class Solution {
public:
    int possibleStringCount(string word) {

        int count=0;

        for(int i=1 ; i< word.length(); i++){
           if(word[i] == word [i-1])
             count++;
        }
      return count + 1; //if there is no error so +1
        
    }
};