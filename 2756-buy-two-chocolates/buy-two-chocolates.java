class Solution 
{
    public int buyChoco(int[] prices, int money) 
    {
    int min_p = Integer.MAX_VALUE;
    int s_min = Integer.MAX_VALUE;

    for(int price : prices)
    {
        if(min_p > price)
        {
            s_min=min_p;
            min_p=price;
        }
        else
        {
            s_min=Math.min(s_min,price);
        }
    }

       if(min_p + s_min > money)
       {
         return money;
       }

       return money - (min_p + s_min);
    }
}