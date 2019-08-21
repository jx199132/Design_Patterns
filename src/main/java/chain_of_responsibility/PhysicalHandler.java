package chain_of_responsibility;

public class PhysicalHandler extends Handler{

    public PhysicalHandler(String type) {
        super(type);
    }

    @Override
    protected boolean canDo(Problem problem) {
        return this.type.equals(problem.getType());
    }

}
