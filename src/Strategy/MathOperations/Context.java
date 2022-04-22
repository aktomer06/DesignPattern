package Strategy.MathOperations;

public class Context {
    OperationStrategy operationStrategy;
    public Context(AlgoType algoType) {
        this.operationStrategy = OperationFactory.getOperationStrategyForAlgoType(algoType);
    }
    public int executeStrategy(int num1, int num2) {
        return operationStrategy.doOperation(num1, num2);
    }
}
