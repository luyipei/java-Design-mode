public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        int l=nums.length;
        //从数组第一个数开始遍历
        int i,j;
        i=0;
        j=0;
        while (i<l){
            j=0;
            while (j<l&j!=i){
                if ((nums[i]+nums[j])==target){
                    result[0]=nums[i];
                    result[1]=nums[j];
                }
                j++;
            }
            i++;
        }


        return result;

    }
}
