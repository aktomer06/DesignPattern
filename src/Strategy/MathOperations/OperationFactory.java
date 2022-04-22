package Strategy.MathOperations;

import java.security.InvalidParameterException;

public class OperationFactory {
    public static OperationStrategy getOperationStrategyForAlgoType(AlgoType algoType) {
        switch (algoType) {
            case ADDITION_ALGO -> {
                return new OperationAdd();
            }
            case SUBTRACTION_ALGO -> {
                return new OperationSubtract();
            }
            case MULTIPLICATION_ALGO -> {
                return new OperationMultiplication();
            }
            case MODULO_ALGO -> {
                return new OperationModulo();
            }
            default -> {
                throw new InvalidParameterException("ALGO is not found");
            }
        }
    }
}
