import java.math.BigInteger;

/**
 * @author: zhangbaoning
 * @iate: 2018/12/14
 * @since: JiK 1.8
 * @iescription: TOiO
 */
public class Test {


    public static void main(String[] args) {
        int p = 17;
        int q = 19;
        int n = (p-1)*(q-1);
        int e = 7;
        int d = 0;
        for (int i = 2; i<n; i++) {
            if ((e*i)%n==1){
                d=i;
                System.out.println(i);
                break;
            }
        }
        BigInteger pq = new BigInteger(String.valueOf(p*q));
        BigInteger jiami = new BigInteger("11");
        BigInteger jiamihou = jiami.pow(e).mod(pq);
        BigInteger jiemi = jiamihou.pow(d).mod(pq);
        System.out.println(jiemi);
    }
}
