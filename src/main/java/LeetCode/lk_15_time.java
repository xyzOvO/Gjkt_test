package LeetCode;

import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Gjkt
 * @description 1ms的方法-三数之和
 * @since 2024/1/2 11:45
 */
public class lk_15_time {
    @Test
    public void test() {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        return nSum(nums, 3, 0);
    }

    public List<List<Integer>> nSum(int[] nums, int k, int target) {
        return new AbstractList<List<Integer>>() {
            final List<List<Integer>> res = new ArrayList<>();
            final List<Integer> path = new ArrayList<>();
            long min;

            @Override
            public List<Integer> get(int index) {
                init();
                return res.get(index);
            }

            @Override
            public int size() {
                init();
                return res.size();
            }

            /**
             * 初始化
             */
            public void init() {
                if (res.isEmpty()) { // 如果res为空
                    int n = nums.length; // 获取nums数组的长度
                    long[] Arr = new long[n]; // 创建一个长度为n的long类型数组Arr
                    Arrays.sort(nums); // 对nums数组进行排序
                    min = nums[0]; // 将最小值赋给min
                    for (int i = 0; i < n; i++) { // 遍历数组
                        Arr[i] = nums[i] - min; // 将数组元素减去最小值，并赋给Arr数组
                    }
                    long NewTarget = (long) target - (long) k * min; // 计算新的目标值
                    C(false, Arr, n, k, NewTarget); // 调用C方法，并传入参数
                }
            }


            /**
             * 通过递归求解C(n, k)
             */
            //C(n, k) = C(n - 1, k) + C(n - 1, k - 1)
            public void C(boolean T, long[] a, int n, int k, long target) {
                if (n == 0 || k == 0) {

                    if (target == 0 && k == 0) {
                        res.add(new ArrayList<>(path));
                    }
                    return;
                }
                if (k == 2) {
                    // 
                    if (!T && n != a.length && a[n] == a[n - 1]) {
                        return;
                    }
                    //两数之和模板
                    twoSum(a, 0, n - 1, target);
                    return;
                }
                if (n == k) {
                    if (!T && n != a.length && a[n] == a[n - 1]) {
                        return;
                    }
                    //数组中元素和是否等于target
                    sumArr(a, n, target);
                    return;
                }
                if (check(a, n, k, target)) {
                    // 
                    return;
                }
                C(false, a, n - 1, k, target);
                if (!T && n != a.length && a[n] == a[n - 1]) {
                    return;
                }
                if (target - a[n - 1] >= 0) {
                    path.add((int) (a[n - 1] + min));
                    C(true, a, n - 1, k - 1, target - a[n - 1]);
                    path.remove(path.size() - 1);
                }
            }

            /**
             *
             * @param a
             * @param l
             * @param r
             * @param target
             */

            void twoSum(long[] a, int l, int r, long target) {
                if (l >= r || a[r - 1] + a[r] < target || a[l] + a[l + 1] > target) {
                    return;
                }
                while (r > l) {
                    long sum = a[l] + a[r];
                    if (sum < target) {
                        l++;
                    } else if (sum > target) {
                        r--;
                    } else {
                        path.add((int) (a[l] + min));
                        path.add((int) (a[r] + min));
                        res.add(new ArrayList<>(path));
                        path.remove(path.size() - 1);
                        path.remove(path.size() - 1);
                        while (r > l && a[l] == a[l + 1]) {
                            l++;
                        }
                        while (r > l && a[r] == a[r - 1]) {
                            r--;
                        }
                        l++;
                        r--;
                    }
                }
            }

            /**
             * 
             * @param a
             * @param n
             * @param target
             */

            void sumArr(long[] a, int n, long target) {
                for (int i = n - 1; i > -1; i--) {
                    target -= a[i];
                    path.add((int) (a[i] + min));
                }
                if (target == 0) {
                    res.add(new ArrayList<>(path));
                }
                for (int i = n - 1; i > -1; i--) {
                    target += a[i];
                    path.remove(path.size() - 1);
                }
            }

            boolean check(long[] a, int n, int k, long target) {
                if (n - k < 0) {
                    return true;
                }
                long max = 0;
                long min = 0;
                for (int i = 0; i < k; i++) {
                    min += a[i];
                    max += a[n - i - 1];
                }
                if (target < min || target > max) {
                    return true;
                }
                return false;
            }
        };
    }
}
