class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int el:nums)
            if(el !=0){
                nums[i++]=el;
            }
        
        while(i<nums.length)
            nums[i++]=0;
        
    }
}