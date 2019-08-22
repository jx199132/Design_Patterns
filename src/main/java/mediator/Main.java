package mediator;

import java.text.MessageFormat;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        CardFriendA a = new CardFriendA("张三", 1000);
        CardFriendB b = new CardFriendB("李四", 1200);
        CardFriendC c = new CardFriendC("王五", 1300);


        System.out.println("中介者来了");
        AbsMediator mediator = new Mediator(a, b, c);

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            System.out.println(MessageFormat.format("开始第{0}盘，A的money是{1}，B的money是{2}，C的money是{3}",i, a.money, b.money, c.money));
            int money = random.nextInt(100);
            int winner = random.nextInt(3);
            if (winner == 0){
                a.win(money, mediator);
            }else if (winner == 1){
                b.win(money, mediator);
            }else {
                c.win(money, mediator);
            }
            System.out.println();
        }
    }

}
