class Solution {
    public static int equilibriumPoint(long arr[], int n) {
              long totalSum=0;
              for(long i : arr)
              totalSum+=i;
              
              long sum=0;
              
              for(int i=0;i<n;i++){
                  totalSum-=arr[i];
                  
                  if(totalSum == sum)
                  return i+1;
                  
                  sum+=arr[i];
                  
               }
            return -1;
        
    }
}
