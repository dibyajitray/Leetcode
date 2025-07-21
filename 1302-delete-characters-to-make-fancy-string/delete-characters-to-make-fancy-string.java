class Solution {
    public String makeFancyString(String s) {

        StringBuilder result = new StringBuilder();

        int n = s.length();

        result.append(s.charAt(0));
        int freq = 1;

        for(int i=1 ; i<n ; i++)
        {
            if(s.charAt(i) == result.charAt(result.length()-1)) // check korbo ki new character input string e, output string er last character er sathe same kina if equal then freq++
            {
                freq++;
                if(freq<3) // jodi freq=3 na hoy tahole append korbo nahole,ignore korbo(mane pointer(i er value automatically egiye jaba))
                {
                    result.append(s.charAt(i));
                }
            }
            else
            {
                result.append(s.charAt(i));
                freq = 1;
            }
        }
        
        return result.toString();
    }
}