public class Solution {
    //改善算法
    //需要用到哈希表，暂时没有学到哈希表那里，所以使用性能差一点的数组
    class Value{
        int index;//下标
        int value;//和目标的差值

    }
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        int l=nums.length;
        int[] value=new int[l];//用来记录中间的值
        //由于a+b=target，因此我们遍历数组，每到一个数，就计算一下target减去他的值，然后看看之前是不是出现过
        //如果出现了就返回这两个数的下标
        value[0]=target-nums[0];
        int i=1;
        int temp;
        while (i<l){
            temp=target-nums[i];
            if (1==1)//如果数组中出现了这个值，就成立{
            {

            }



        }



        return result;

    }
}
