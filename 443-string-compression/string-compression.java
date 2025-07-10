class Solution {
    public int compress(char[] chars) {
      
      int write = 0;
      int i = 0;

      while(i < chars.length)
      {
        int count = 0;
         char curnt = chars[i];

         while(i < chars.length && chars[i] == curnt )
         {
            count++;
            i++;
         }
          chars[write] = curnt;
          write ++;

          if(count>1)
          {
            String cnt = Integer.toString(count);
            for(char ch : cnt.toCharArray())
            {
                chars[write] = ch;
                write ++;
            }
          }

      }
        
        return write;
    }
}