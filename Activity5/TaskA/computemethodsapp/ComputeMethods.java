
package computemethodsapp;


class ComputeMethods {
      // Method to convert Fahrenheit to Celsius
    public double fToC(double degreesF) {
        double celsius = (degreesF - 32) * 5 / 9;
        return celsius;
    }

    // Method to calculate the hypotenuse of a triangle given sides a and b
    public double hypotenuse(int a, int b) {
        double hypotenuseLength = Math.sqrt((a * a) + (b * b));
        return hypotenuseLength;
    }

    // Method to simulate rolling two dice
    public int roll() {
        int die1 = (int)(Math.random() * 6) + 1;
        int die2 = (int)(Math.random() * 6) + 1;
        return die1 + die2;
    }
}
