class Solution {
    public String intToRoman(int num) {

        int val[] =    {1000, 900, 500, 400, 100, 90,  50,  40,  10, 9,   5,  4,  1};
        String str[] = {"M",  "CM","D", "CD", "C", "XC","L", "XL", "X","IX","V","IV","I"}; //checking first (i=0) highest roman value then going to lower value 

        int i=0;
        StringBuilder result = new StringBuilder();

        while(num > 0)
        {
            while(num >= val[i])
            {
                result.append(str[i]);
                num = num - val[i];
            }
            i++;
        }
        
        return result.toString();
    }
}