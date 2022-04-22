package Strategy.Test;

import Strategy.MathOperations.*;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(AlgoType.ADDITION_ALGO);
        int result = context.executeStrategy(10, 20);
        System.out.println("Addition Result = " + result);

        Context context1 = new Context(AlgoType.MULTIPLICATION_ALGO);
        int result1 = context1.executeStrategy(10, 20);
        System.out.println("Multiplication Result = " + result1);

        Context context2 = new Context(AlgoType.MODULO_ALGO);
        int result2 = context2.executeStrategy(100, 20);
        System.out.println("Modulo Result = " + result2);

        OperationStrategy operationStrategy = OperationFactory.getOperationStrategyForAlgoType(AlgoType.MODULO_ALGO);
        System.out.println("Modulo = " + operationStrategy.doOperation(10,20));
    }
}
