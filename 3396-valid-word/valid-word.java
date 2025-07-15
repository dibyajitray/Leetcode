class Solution {
    public boolean isValid(String word) {

        boolean hasvowel = false;
        boolean hascons = false;

        if(word.length() < 3 )
        {
            return false;
        }

        for(char ch : word.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                ch=Character.toLowerCase(ch);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    hasvowel = true;
                }

                else
                {
                    hascons = true;
                }
            }

            else if(!Character.isDigit(ch))
            {
                return false;
            }
        }

        return hasvowel && hascons;
        
    }
}