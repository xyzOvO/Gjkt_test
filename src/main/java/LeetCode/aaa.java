package LeetCode;

import java.util.*;

public class aaa {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(1e2 + 7);
        System.out.println(solution.pickGifts(new int[]{1, 1, 1, 1}, 1));
//        int[] arr = new int[]{1, 9, 3};
//        System.out.println(Arrays.stream(arr).max().getAsInt());
//        System.out.println(Math.floor(Math.sqrt(100)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
        //
        //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
        //
        //你可以按任意顺序返回答案。
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }

    /*
    * 矩形蛋糕的高度为 h 且宽度为 w，给你两个整数数组 horizontalCuts 和 verticalCuts，其中：
 horizontalCuts[i] 是从矩形蛋糕顶部到第  i 个水平切口的距离
verticalCuts[j] 是从矩形蛋糕的左侧到第 j 个竖直切口的距离
请你按数组 horizontalCuts 和 verticalCuts 中提供的水平和竖直位置切割后，请你找出 面积最大 的那份蛋糕，并返回其 面积 。由于答案可能是一个很大的数字，因此需要将结果 对 109 + 7 取余 后返回。
    *
    * */
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int maxh = 0;
        int maxv = 0;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        // 找竖直最大距离
        // 可能只有一个切口
        maxh = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length - 1]);
        for (int i = 0; i < horizontalCuts.length - 1; i++) {
            maxh = Math.max(maxh, horizontalCuts[i + 1] - horizontalCuts[i]);
        }
        // 找水平最大距离
        maxv = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length - 1]);
        for (int i = 0; i < verticalCuts.length - 1; i++) {
            maxv = Math.max(maxv, verticalCuts[i + 1] - verticalCuts[i]);
        }
        return (int) ((maxh * maxv * 1L) % (1e9 + 7));
        //return (maxh * maxv);
    }
// 2558. 从数量最多的堆取走礼物
//    public long pickGifts(int[] gifts, int k) {
//        long sum = 0;
//        for (int i = gifts.length - 1; i >= gifts.length - k; i--) {
//            Arrays.sort(gifts);
//            gifts[gifts.length - 1] = (int) Math.floor(Math.sqrt(gifts[gifts.length - 1]));
//        }
//        for (int i : gifts) {
//            sum += (long) i;
//        }
//        return sum;
//    }

    //    public long pickGifts(int[] gifts, int k) {
//        long sum = 0;
//        // 实例化堆并写入
//        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        for (int i : gifts) {
//            queue.offer(i);
//        }
//        for (int i = 0; i < k; i++) {
//            int max = (int) queue.poll();// 获取堆顶
//            int sqrt = (int) Math.floor(Math.sqrt(max));
//            queue.offer(sqrt);
//        }
//        for (Integer i : queue) {
//            sum += i;
//        }
//        return sum;
//    }
    public long pickGifts(int[] gifts, int k) {
        heapify(gifts); // 原地堆化（大顶堆）
        // 注意：判断堆顶是否为1
        while (k-- > 0 ) {
            gifts[0] = (int) Math.sqrt(gifts[0]); // 直接修改堆顶
            // 下沉方法
            sink(gifts, 0); // 堆化（只需要把 gifts[0] 下沉）
        }

        long ans = 0;
        for (int x : gifts) {
            ans += x;
        }
        return ans;
    }

    // 原地堆化（大顶堆）
    // 堆化可以保证 h[0] 是堆顶元素，且 h[i] >= max(h[2*i+1], h[2*i+2])
    private void heapify(int[] h) {
        // h.length / 2 - 1 倒着遍历，保证堆结构
        for (int i = h.length / 2 - 1; i >= 0; i--) {
            sink(h, i);
        }
    }

    // 下沉方法
    private void sink(int[] h, int i) {
        int n = h.length;
        while (2 * i + 1 < n) {
            int j = 2 * i + 1; // i 的左儿子
            if (j + 1 < n && h[j + 1] > h[j]) { // i 的右儿子比 i 的左儿子大
                j++;
            }
            if (h[j] <= h[i]) { // 说明 i 的左右儿子都 <= h[i]，停止下沉
                break;
            }
            swap(h, i, j); // 下沉
            i = j;
        }
    }

    // 交换 h[i] 和 h[j]
    private void swap(int[] h, int i, int j) {
        int tmp = h[i];
        h[i] = h[j];
        h[j] = tmp;
    }


}

