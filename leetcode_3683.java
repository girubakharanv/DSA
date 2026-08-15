/*
->You are given a 2D integer array tasks where tasks[i] = [si, ti].
->Each [si, ti] in tasks represents a task with start time si that takes ti units of time to finish.
->Return the earliest time at which at least one task is finished.
*/

 class leetcode_3683 {
    public int earliestTime(int[][] tasks) {
        int[] ans=new int[tasks.length];
       
        for(int i=0;i<tasks.length;i++){
            int count=0;
            for(int j=0;j<tasks[i].length;j++){
                count+=tasks[i][j];
            }
            ans[i]=count;
        }
        int min=ans[0];
        for(int i=0;i<ans.length;i++){
            if(ans[i]<min){
                min=ans[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        leetcode_3683 obj = new leetcode_3683();
        int[][] tasks = {{1,6},{2,3}};
        int ans = obj.earliestTime(tasks);
        System.out.println(ans);
    }
}

/*
->Example 1:

Input: tasks = [[1,6],[2,3]]
Output: 5
Explanation:
The first task starts at time t = 1 and finishes at time 1 + 6 = 7. The second task finishes at time 2 + 3 = 5. You can finish one task at time 5.

->Example 2:

Input: tasks = [[100,100],[100,100],[100,100]]
Output: 200
Explanation:
All three tasks finish at time 100 + 100 = 200.
*/
 