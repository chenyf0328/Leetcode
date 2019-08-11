/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.Arrays;
import java.util.Comparator;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null)
            return null;

        if (nums.length == 0)
            return "";

        if (nums.length == 1)
            return String.valueOf(nums[0]);

        StringBuilder sb = new StringBuilder();

        String[] strs = new String[nums.length];

        for(int i=0; i<nums.length; i++)
            strs[i] = Integer.toString(nums[i]);

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length())
                    return s2.compareTo(s1);

                return (s2+s1).compareTo(s1+s2);
            }
        });

        if (strs[0].equals("0"))
            return "0";

        for (int i=0;i<nums.length;i++){
            sb.append(strs[i]);
        }

        return sb.toString();
    }
}
