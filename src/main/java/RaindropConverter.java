
class RaindropConverter {

    public static void main(String[] args) {
        int number = 28;
        System.out.println(convert(number));

    }

    // This method outputs a String based on if the parameter value is a factor of 3, 5, 7 or a combination of all three.
    public static String convert(int number) {
        // Checks if number is a factor of all three
        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            return "PlingPlangPlong";
        // Checks if number is a factor of either combination
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "PlingPlang";
        } else if (number % 3 == 0 && number % 7 == 0) {
            return "PlingPlong";
        } else if (number % 5 == 0 && number % 7 == 0) {
            return  "PlangPlong";
        // Checks if number only has a factor of one of three
        } else if (number % 3 == 0) {
            return "Pling";
        } else  if (number % 5 == 0) {
            return "Plang";
        } else if (number % 7 == 0) {
            return "Plong";
        } else {
            // Returns the number if it has no factor of the three; in String type
            return String.valueOf(number);
        }
    }

}
