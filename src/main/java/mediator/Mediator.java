package mediator;

public class Mediator extends AbsMediator {
    public Mediator(CardFriendA a, CardFriendB b, CardFriendC c) {
        super(a, b, c);
    }

    @Override
    public void winA(int money) {
        int half = money / 2;
        int other = money - half;

        cardFriendA.money = cardFriendA.money + money;
        cardFriendB.money = cardFriendB.money - half;
        cardFriendC.money = cardFriendC.money - other;
        System.out.println("a 赢了 " + money + " , b 输了 " + half + " , c 输了 " + other);
    }

    @Override
    public void winB(int money) {
        int half = money / 2;
        int other = money - half;

        cardFriendB.money = cardFriendB.money + money;
        cardFriendC.money = cardFriendC.money - half;
        cardFriendA.money = cardFriendA.money - other;
        System.out.println("a 输了 " + other + " , b 赢了 " + money + " , c 输了 " + half);
    }

    @Override
    public void winC(int money) {
        int half = money / 2;
        int other = money - half;

        cardFriendC.money = cardFriendC.money + money;
        cardFriendA.money = cardFriendA.money - half;
        cardFriendB.money = cardFriendB.money - other;
        System.out.println("a 输了 " + half + " , b 输了 " + other + " , c 赢了 " + money);
    }
}
