package chain_of_responsibility;

public class MathematicsHandler extends Handler {

    public MathematicsHandler(String type) {
        super(type);
    }

    @Override
    protected boolean canDo(Problem problem) {
        return this.type.equals(problem.getType());
    }
}
