/*
->Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
->You must write an algorithm with O(log n) runtime complexity.
*/
class search_insert_position {
      static public int searchInsert(int[] nums, int target) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target){
                ans=i;
            }else{
                if(nums[i]<target){
                   ans=i+1;
                }
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int index = searchInsert(nums, target);
        System.out.println("Index:" + index);
        System.out.println();
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 2;
        int index1 = searchInsert(nums1, target1);
        System.out.println("Index: " + index1);
    }  
}

/*
Input: nums = [1,3,5,6], target = 5
Output: 2

Input: nums = [1,3,5,6], target = 2
Output: 1
*/