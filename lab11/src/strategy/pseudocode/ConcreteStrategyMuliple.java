package strategy.pseudocode;

public class ConcreteStrategyMuliple implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a*b;
    }
}
