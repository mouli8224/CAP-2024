import java.util.*;
class Dfs{
    ArrayList<Integer> list1 = new ArrayList<>();
    public void dfs(int val1 ,int[] nums,ArrayList<ArrayList<Integer>> adj){
         nums[val1] = 1;
         list1.add(val1);
         for(int i : adj.get(val1)){
             if(nums[i]!=1){
                 dfs(i,nums,adj);
             }
         }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list2 = adj.get(0);
        int[] nums = new int[V];
        dfs(0,nums,adj);
        return list1;
    }
}
