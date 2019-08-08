package template;

/**
 * 篮球游戏
 */
public class Basketball extends GameAbs {
    @Override
    void init() {
        System.out.println("到篮球场结合");
    }

    @Override
    void start() {
        System.out.println("人员分配完成，开始");
    }

    @Override
    void fun() {
        System.out.println("你来我往，激烈比赛");
    }

    @Override
    void end() {
        System.out.println("时间到，比赛结果 100 ：100");
    }
}
