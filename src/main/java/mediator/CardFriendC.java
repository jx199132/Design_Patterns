package mediator;

public class CardFriendC extends CardFriend {
    public CardFriendC(String name, int money) {
        super(name, money);
    }

    @Override
    void win(int money, AbsMediator mediator) {
        mediator.winC(money);
    }

}
