import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhangbaoning
 * @date: 2018/12/14
 * @since: JDK 1.8
 * @description: TODO
 */
public class Main {
    public static void main(String[] args) {
        int p = RandomPrime.prime();
        int q = RandomPrime.prime();
        System.out.println("p:"+p+" q:"+q);
        int n = (p - 1) * (q - 1);
        BigInteger pq = new BigInteger(String.valueOf(p*q));
        int e;
        do {
            e = RandomPrime.prime();
        } while (n <= e && n % e == 0);
        System.out.println("n=" + n + "e=" + e);
        int d = 2;
        for (; ; d++) {
            if (((e * d) % n == 1)) {
                System.out.println("d:"+d);
                break;
            }
        }

        String miwen = "zhangbaoning";
        char[] miwens = miwen.toCharArray();
        List<BigInteger> miwenList = new ArrayList();
        System.out.println("加密");

        for (char c : miwens) {
            BigInteger cha = new BigInteger(String.valueOf((int)c));
            BigInteger jiamiwen = cha.pow(e).mod(pq);
            miwenList.add(jiamiwen);
            System.out.print(jiamiwen+" ");
        }
        System.out.println();
        System.out.println("解密");
        for (BigInteger jiamiwen : miwenList) {
            BigInteger jiemi= jiamiwen.pow(d).mod(pq);
            System.out.print((char) jiemi.intValue()+" ");
        }
    }


}
