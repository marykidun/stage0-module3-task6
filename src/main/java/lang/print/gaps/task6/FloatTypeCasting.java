package lang.print.gaps.task6;

public class FloatTypeCasting {
    public static void roundNumber(float numberToBeRounded) {
                int newNumber = (int)(Math.round(numberToBeRounded));
        System.out.println(newNumber);
    }
    public static void main(String[] args) {
        roundNumber(10.5F);

    }
}


