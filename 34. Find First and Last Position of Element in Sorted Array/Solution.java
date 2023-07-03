class Solution {
    public static int[] searchRange(int[] nums, int target) {
        
        
        int p1 = 0, p2 = nums.length-1;
        int results []= new int[]{-1, -1};
        while(p1<nums.length){
            

            if(nums[p1] == target && results[0] == -1)
                results[0] = p1;

            else if(results[0]==-1)
                p1++;

            if(nums[p2] == target && results[1] == -1)
                results[1] = p2;
            
            else if(results[1]==-1)
                p2--;

            if(results[0]!= -1 && results[1]!= -1)
                return results;


        }

        return results;
    }

    public static void main(String [] args){

        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        int results [] = searchRange(nums, target);
        System.out.printf("%d %d", results[0], results[1]);
    }
}