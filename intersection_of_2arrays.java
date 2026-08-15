/*
->Given two integer arrays nums1 and nums2, return an array of their intersection. 
->Each element in the result must be unique and you may return the result in any order.
*/
 import java.util.ArrayList;
class intersection_of_2arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
       
        int increment;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                        if(!list.contains(nums1[i])){
                        list.add(nums1[i]);
                    }

                }
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
        ans[i] = list.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        intersection_of_2arrays obj = new intersection_of_2arrays();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = obj.intersection(nums1, nums2);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

}

/*
->Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

->Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */