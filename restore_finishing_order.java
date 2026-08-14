/*
->You are given an integer array order of length n and an integer array friends.
->order contains every integer from 1 to n exactly once, representing the IDs of the participants of a race in their finishing order.
->friends contains the IDs of your friends in the race sorted in strictly increasing order. Each ID in friends is guaranteed to appear in the order array.
->Return an array containing your friends' IDs in their finishing order.
*/
 
class restore_finishing_order {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans=new int[friends.length];
        int add=0;
        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    ans[add]=order[i];
                    add++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        restore_finishing_order obj = new restore_finishing_order();
        int[] order = {3,1,2,5,4};
        int[] friends = {1,3,4};
        int[] ans = obj.recoverOrder(order,friends);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}


/*
->Example 1:

Input: order = [3,1,2,5,4], friends = [1,3,4]
Output: [3,1,4]
Explanation:
The finishing order is [3, 1, 2, 5, 4]. Therefore, the finishing order of your friends is [3, 1, 4].

->Example 2:

Input: order = [1,4,5,3,2], friends = [2,5]
Output: [5,2]
Explanation:
The finishing order is [1, 4, 5, 3, 2]. Therefore, the finishing order of your friends is [5, 2].
*/
 