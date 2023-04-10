class Majority_Element {
    public int majorityElement(int[] nums) {
        int majour=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(count<1){
                majour=nums[i];
            }
            if(nums[i]==majour){
                count++;
            }else{
                count--;
            }
        }
        return majour;
        
    }
}
