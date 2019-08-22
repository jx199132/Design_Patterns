package mediator;

public abstract class AbsMediator {

    protected CardFriendA cardFriendA;
    protected CardFriendB cardFriendB;
    protected CardFriendC cardFriendC;

    public AbsMediator(CardFriendA a, CardFriendB b, CardFriendC c){
        this.cardFriendA = a;
        this.cardFriendB = b;
        this.cardFriendC = c;
    }

    public abstract void winA(int money);

    public abstract void winB(int money);

    public abstract void winC(int money);

}
