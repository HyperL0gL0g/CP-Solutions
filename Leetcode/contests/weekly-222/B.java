import java.util.HashMap;

public class B {
    public static void main(String[] args) {
        countPairs(new int[2]);

    }

    public static int countPairs(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int mod = 1000000007;
        long ans = 0;
        for (int i : arr) {
            int power = 1;
            for (int j = 0; j < 21; j++) {
                if (map.containsKey(power - i)) {
                    ans += map.get(power - i);
                    ans %= mod;
                }
                power *= 2;
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return (int) ans;

    }
}

