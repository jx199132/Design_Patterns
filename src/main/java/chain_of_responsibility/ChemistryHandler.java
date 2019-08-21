package chain_of_responsibility;


public class ChemistryHandler extends Handler {

    public ChemistryHandler(String type) {
        super(type);
    }

    @Override
    protected boolean canDo(Problem problem) {
        return this.type.equals(problem.getType());
    }
}
