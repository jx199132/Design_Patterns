package template;

/**
 * 足球游戏
 */
public class FootGame extends GameAbs {
    @Override
    void init() {
        System.out.println("找足球场地，召集小伙伴");
    }

    @Override
    void start() {
        System.out.println("比赛开始");
    }

    @Override
    void fun() {
        System.out.println("大家玩得很开心");
    }

    @Override
    void end() {
        System.out.println("比赛结束，结果 3：3");
    }
}
