package mediator;

public class CardFriendB extends CardFriend {
    public CardFriendB(String name, int money) {
        super(name, money);
    }

    @Override
    void win(int money, AbsMediator mediator) {
        mediator.winB(money);
    }

}
