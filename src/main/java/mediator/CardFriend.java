package mediator;

/**
 * 打牌者抽象类
 */
public abstract class CardFriend {

    protected String name;
    protected int money;


    public CardFriend(String name, int money){
        this.money = money;
        this.name = name;
        System.out.println(name + "带了" + money + "来打牌");
    }

    // 由中介者来计算金额
    abstract void win(int money, AbsMediator mediator);
}
