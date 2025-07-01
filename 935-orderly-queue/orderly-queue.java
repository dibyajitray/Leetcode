class Solution 
{
    public String orderlyQueue(String s, int k) 
    {

        if(k==1)
        {
            String min=s;
            for(int i=1 ; i<s.length() ; i++)
            {
                String rotate = s.substring(i) + s.substring(0,i);
                if(rotate.compareTo(min)<0)
                {
                    min=rotate;
                }
            }
            return min;
        }
        else 
        {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            s = new String(c);
        }
        return s;
    }
}