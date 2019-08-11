import java.util.ArrayList;
import java.util.List;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution364 {

    /*
    private List<Integer> list;

    public int depthSumInverse(List<NestedInteger> nestedList) {
        if (nestedList == null || nestedList.size() == 0)
            return 0;

        if (nestedList.size() == 1 && nestedList.get(0).isInteger())
            return nestedList.get(0).getInteger();

        list = new ArrayList<>();
        list.add(0);
        int sum = 0;

        for (int i=0;i<nestedList.size();i++)
            helper(nestedList.get(i), 0);

        for (int i = 0;i<list.size();i++){
            sum += list.get(i) * (list.size() - i);
        }

        return sum;
    }

    public void helper(NestedInteger nestedInteger, int depth){
        int sum = depth < list.size() ? list.get(depth) : 0;
        if (depth >= list.size())
            list.add(0);

        if (nestedInteger.isInteger()) {
            sum = sum + nestedInteger.getInteger();
            list.set(depth, sum);
            return;
        }
        for (int i=0;i<nestedInteger.getList().size();i++){
            helper(nestedInteger.getList().get(i), depth + 1);
        }
    }

    */
}