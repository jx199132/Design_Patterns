package chain_of_responsibility;

/**
 * 处理问题的抽象类
 */
public abstract class Handler {

    protected String type;

    protected Handler next;

    public Handler(String type){
        this.type = type;
    }

    public Handler setNext(Handler next){
        this.next = next;
        return next;
    }

    /**
     * 处理问题
     * @param problem
     */
     public final void doHandler(Problem problem){
         if (canDo(problem)){
             done(problem);
         }else if (next != null){
             System.out.println(type + "老师 无法解决" + problem.getType() + " 问题");
             next.doHandler(problem);
         }else {
             fail(problem);
         }
     }

    private void fail(Problem problem){
        System.out.println("谁都无法无法解决" + problem.getType() + "问题");
    }

    // 为了简化代码，这里只把canDo 由实现类去实现，done放到父类处理了
    private void done(Problem problem){
        System.out.println(type + "老师 解决了 " + problem.getType() + " 问题");
    }

    protected abstract boolean canDo(Problem problem);
}