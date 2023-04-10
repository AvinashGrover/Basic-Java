class Missing_Number_In_Array {
  public  int MissingNumber(int array[], int n) {
       Arrays.sort(array);
       int k=0 , i=0;
       if(array[0]!=1){
           return 1;
       }
       for(i=array[0];i<=array[array.length-1];i++){
           if(array[k]!=i){
               break;
               
           }
             k=k+1;
       }
       return i ;
    }

}
