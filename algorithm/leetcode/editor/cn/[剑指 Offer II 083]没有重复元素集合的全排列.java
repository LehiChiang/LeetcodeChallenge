package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class permuteOffer2Solution {

    private List<List<Integer>> res;
//    public List<List<Integer>> permute(int[] nums) {
//        res = new ArrayList<>();
//        dfs(nums, new LinkedList<>());
//        return res;
//    }

//    private void dfs(int[] nums, LinkedList<Integer> path) {
//        if (path.size() == nums.length) {
//            res.add(new ArrayList<>(path));
//            return;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (path.contains(nums[i]))
//                continue;
//            path.add(nums[i]);
//            dfs(nums, path);
//            path.removeLast();
//        }
//    }

    public static void main(String[] args) {
        permuteOffer2Solution solution = new permuteOffer2Solution();
        System.out.println(solution.permute(new int[]{1, 2, 3}));
    }

    private List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(nums, 0, path);
        return res;
    }

    private void dfs(int[] nums, int index, List<Integer> path) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if (path.contains(nums[i]))
                continue;
            path.add(nums[i]);
            dfs(nums, 0, path);
            path.remove(path.size() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
