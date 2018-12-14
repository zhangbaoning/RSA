import java.util.Random;

/**
 * @author: zhangbaoning
 * @date: 2018/12/14
 * @since: JDK 1.8
 * @description: TODO
 */
public class RandomPrime {
    public static int prime(){
        int prime;
        do {
            Random random = new Random();
           prime = random.nextInt(100);
        }while (!judge(prime));
        return prime;
    }
    public static boolean judge(int i){
        if (i%2==0&&i<3){
            return false;
        }
        for (int j=3;j<i;j++){
            if (i%j==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(prime());
    }
}
