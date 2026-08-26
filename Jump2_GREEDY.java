public class Jump2_GREEDY {// INCOMPLETED
    class Solution {

    public int jump(int[] nums) {

        // Number of jumps made
        int jumps = 0;

        // End of the current jump range
        int currentEnd = 0;

        // Farthest position reachable
        int farthest = 0;

        // We don't need to process the last index
        for (int i = 0; i < nums.length - 1; i++) {

            // Find the farthest position
            // reachable from the current range
            farthest = Math.max(
                farthest,
                i + nums[i]
            );

            // Current jump range is finished
            if (i == currentEnd) {

                // Make a new jump
                jumps++;

                // Expand the range
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}
}
