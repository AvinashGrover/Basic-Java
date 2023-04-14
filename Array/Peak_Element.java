class Peak_Element
{
	public int peakElement(int[] arr,int n)
    {
       int l=0,h=n-1;
       while(l<=h){
           int mid= (l+h)/2;
           if((mid==0 || arr[mid]>=arr[mid-1] ) && (mid==n-1 || arr[mid]>=arr[mid+1] )){
               return mid;
               
           }else if(arr[mid+1]>=arr[mid]){
               l=mid+1;
               
           }else{
               h=mid-1;
               
           }
       }
       return -1;
    }
    
}
