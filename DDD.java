import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class DDD {
    public static  void  main(String[] args) {
        System.out.println("ПОСТАВЬ ТАЙМЕР");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" на сколько секунд вы хотите поставить таймер???????");
        Scanner M = new Scanner(System.in);
        int a = Integer.parseInt(M.nextLine());
        while (a != 0) {
            try {
                System.out.println(a);
                TimeUnit.SECONDS.sleep(1);
                --a;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(0);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("конец таймера");

    }}