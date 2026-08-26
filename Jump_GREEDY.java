public class Jump_GREEDY {
    

    public boolean canJump(int[] nums) {

        // Farthest index we can currently reach
        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {

            // If current index is unreachable
            if (i > farthest) {
                return false;
            }

            // Update the farthest reachable position
            farthest = Math.max(
                farthest,
                i + nums[i]
            );

            // We can already reach the end
            if (farthest >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        Jump_GREEDY obj = new Jump_GREEDY();
        System.out.println(obj.canJump(nums));  
    }
}

