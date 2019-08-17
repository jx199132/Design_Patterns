package abstract_factory;

/**
 * 抽象工厂
 */
public abstract class AbsFactory {

    public abstract void getMouseAndBoard();

    public static AbsFactory getInstance(String type){
        AbsFactory factory = null;
        if ("hp".equals(type)){
            factory = new HpFactory();
        }else if ("luoji".equals(type)){
            factory = new LuojiFactory();
        }
        return factory;
    }
}
