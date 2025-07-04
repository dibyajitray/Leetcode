class Solution {
    public void sortColors(int[] arr) {

        int l = arr.length;

        int i = 0; //for 0
        int j = 0; // for 1
        int k = l-1; // for 2
        int temp;

        while(j <= k)
        {
            if(arr[j]==2)
            {
               temp= arr[j];
               arr[j]=arr[k];
               arr[k]=temp;
               k-- ;
            }

            else if(arr[j]==0)
            {
               temp= arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
               i++ ;
               j++;
            }

            else
            {
                j++;
            }
              
        }
        
    }
}