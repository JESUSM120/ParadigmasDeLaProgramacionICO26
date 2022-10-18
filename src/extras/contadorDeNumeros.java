package extras;

public class contadorDeNumeros {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 0; i < 10; i++) {
            counter++;
            printMsg(counter);
        }
    }

    static void printMsg(int counterValue) {
        System.out.println("Your counter value is: "+counterValue);
    }
}
