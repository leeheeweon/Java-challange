package academy.learnprogramming;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        double adding = firstNumber + secondNumber;
        return adding;
    }

    public double getSubtractionResult() {
        double subtracting = firstNumber - secondNumber;
        return subtracting;
    }

    public double getMultiplicationResult() {
        double multiplying = firstNumber * secondNumber;
        return multiplying;
    }

    public double getDivisionResult() {
        double dividing = firstNumber / secondNumber;

        if (secondNumber == 0) {
            dividing = 0;
        }

        return dividing;
    }
}
