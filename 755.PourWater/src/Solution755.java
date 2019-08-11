/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

/** \brief      
 *
 *  \param     
 *
 *  \returns        
 */

/*
    Time Complexity: O(V * N), where NN is the length of heights. For each of VV droplets, our while loop might iterate NN times.
    Space Complexity: O(1) in additional space complexity.
*/


public class Solution755 {
    public int[] pourWater(int[] heights, int V, int K) {
        for (int i=1;i<=V;i++){
            // check left side
            if (helper(heights, heights[K], K - 1, 'l'))
                continue;
            // check right side
            if (helper(heights, heights[K], K + 1, 'r'))
                continue;

            heights[K]++;
        }

        return heights;
    }

    public boolean helper(int[] heights, int row, int col, char dirc){
        if (col < 0 || col == heights.length)
            return false;

        if (heights[col] < row) {

            // droplet dropped
            heights[col]++;
            int currentLevel = heights[col];

            // check if there's any possible lower
            if (dirc == 'l')
                if (col - 1 >= 0)
                    if (helper(heights, currentLevel - 1, col - 1, 'l')) {
                        // cancel the droplet before
                        heights[col]--;

                        return true;
                    }
            // check right side
            if (dirc == 'r')
                if (col + 1 <= heights.length)
                    if (helper(heights, currentLevel - 1, col + 1, 'r')) {
                        // cancel the droplet before
                        heights[col]--;

                        return true;
                    }

            return true;
        }
        else if (heights[col] == row){

            // check left side
            if (dirc == 'l')
                return helper(heights, row, col - 1, 'l');
            else
                return helper(heights, row, col + 1, 'r');
        }
        else{
            return false;
        }
    }
}
