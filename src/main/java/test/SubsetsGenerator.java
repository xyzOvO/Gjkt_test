package test;

import java.util.ArrayList;
import java.util.List;

public class SubsetsGenerator {
    public static void main(String[] args) {
        List<Integer> originalSet = new ArrayList<>();
        originalSet.add(1);
        originalSet.add(2);
        originalSet.add(3);

        // 生成集合的所有子集
        List<List<Integer>> subsets = generateSubsets(originalSet);
        
        // 输出所有子集
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

    public static List<List<Integer>> generateSubsets(List<Integer> set) {
        List<List<Integer>> subsets = new ArrayList<>();
        // 调用辅助函数生成子集
        generateSubsetsHelper(set, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    // 递归函数：生成子集
    private static void generateSubsetsHelper(List<Integer> set, int index, List<Integer> currentSubset, List<List<Integer>> subsets) {
        // 如果已经遍历完所有元素，将当前子集加入结果
        if (index == set.size()) {
            subsets.add(new ArrayList<>(currentSubset));
            return;
        }

        // 包括当前元素在子集中
        currentSubset.add(set.get(index));
        generateSubsetsHelper(set, index + 1, currentSubset, subsets);

        // 不包括当前元素在子集中
        currentSubset.remove(currentSubset.size() - 1);
        generateSubsetsHelper(set, index + 1, currentSubset, subsets);
    }
}
