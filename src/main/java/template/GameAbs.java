package template;

/**
 * 玩游戏的抽象类
 */
public abstract class GameAbs {

    abstract void init();

    abstract void start();

    abstract void fun();

    abstract void end();

    final void play(){
        init();
        start();
        fun();
        end();
    }
}
