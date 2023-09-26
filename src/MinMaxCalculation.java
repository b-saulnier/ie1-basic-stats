class MinMaxCalculation {
    public static double max(double ... numbers) {
        double maximum = numbers[0];
        for (double number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }

        return maximum;
    }

    public static double min(double ... numbers) {
        double minimum = numbers[0];
        for (double number : numbers) {
            if (number < minimum) {
                minimum = number;
            }
        }

        return minimum;
    }
}