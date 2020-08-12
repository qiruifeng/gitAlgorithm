package nowcoder;

/**
 * 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1，m<=n），每段绳子的长度记为k[1],...,k[m]。
 * 请问k[1]x...xk[m]可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 */
public class cutRope {
    public static int cutRope(int target) {
        //1 特殊条件
        if (target == 1 && target == 2) {
            return 1;
        }

        if (target == 3) {
            return 2;
        }

        //2 其他情况调用递归函数
        return f(target);
    }

    public static int f(int n) {
        //1 递归终止条件 表明不分，长度是最大的
        if (n <= 4) {
            return n;
        }

        int res = 0;
        for (int i = 1; i < n; i++) {
            res = Math.max(res, i * f(n - i));
        }

        return res;
    }

    public static int dp(int target) {
        int[] res = new int[target];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;

        for (int i = 3; i < target; i++) {

            int ans=0;
            for (int j = 0; j < i; j++) {
                ans=Math.max(ans,(j+1)*res[i-j-1]);
            }
            res[i]=ans;
        }
        return res[target-1];
    }

    public static void main(String[] args) {
        int a = 8;
        System.out.println(cutRope(7));
        System.out.println(dp(8));
    }
}
