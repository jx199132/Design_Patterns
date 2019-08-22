package mediator;

public class CardFriendA extends CardFriend {

    public CardFriendA(String name, int money) {
        super(name, money);
    }

    @Override
    void win(int money, AbsMediator mediator) {
        mediator.winA(money);
    }
}
