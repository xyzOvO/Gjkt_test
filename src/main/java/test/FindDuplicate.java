package test;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] documents = {3, 4, 2, 1, 1, 0};
        int result = findDuplicate(documents);
        System.out.println("存在副本的文件 id 是: " + result);
    }

    public static int findDuplicate(int[] documents) {
        int result = 0;
        for (int docId : documents) {
            result ^= docId;
        }
        return result;
    }
}