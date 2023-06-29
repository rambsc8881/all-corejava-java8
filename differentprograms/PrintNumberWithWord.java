package oopsconcepts.differentprograms;

public class PrintNumberWithWord {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i == 1) {
                System.out.println(i + "st");
                i++;
            }
            if (i == 2) {
                System.out.println(i + "nd");
                i++;
            }
            if (i == 3) {
                System.out.println(i + "rd");
                i++;
            }
            if (i == 4) {
                System.out.println(i + "th");
                i++;
            } else {
                System.out.println("numbers are completed");
            }
        }

    }
}
