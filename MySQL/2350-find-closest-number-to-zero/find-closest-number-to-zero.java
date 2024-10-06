class Solution {
    public int findClosestNumber(int[] nums) {
 
        int closest=nums[0];
        for (int i : nums) 
            if(closest<=0&&i<=0&&i>closest)
                closest=i;
            else if(closest<=0&&i>=0&&-closest>=i)
                    closest=i;
            else if(closest>=0&&i<=0&&closest>-i)
                closest=i;
            else if(closest>=0&&i>=0&&closest>i)
                closest=i;
        return closest;
    }
}
        
