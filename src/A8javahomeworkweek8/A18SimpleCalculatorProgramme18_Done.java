package A8javahomeworkweek8;

public class A18SimpleCalculatorProgramme18_Done {
        public static void main(String[] args) {
            A18SimpleCalculatorProgramme18_Done calculator = new A18SimpleCalculatorProgramme18_Done();
            calculator.setFirstNumber(5.0);
            calculator.setSecondNumber(4);
            System.out.println("add= " + calculator.getAdditionResult());
            System.out.println("subtract= " + calculator.getSubtractionResult());
            calculator.setFirstNumber(5.25);
            calculator.setSecondNumber(0);
            System.out.println("multiply= " + calculator.getMultiplicationResult());
            System.out.println("divide= " + calculator.getDivisionResult());
        }

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
            return firstNumber + secondNumber;
        }
        public double getSubtractionResult() {
            return firstNumber - secondNumber;
        }
        public double getMultiplicationResult() {
            return firstNumber * secondNumber;
        }
        public double getDivisionResult() {

            if (secondNumber == 0) {
                return this.secondNumber = 0;
            } else {
                return firstNumber / secondNumber;

            }
        }
    }