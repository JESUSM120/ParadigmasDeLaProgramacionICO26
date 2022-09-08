package ManejodeErrores;

public class Princinpal {
    public static void main(String[] args) {
        int []numeros={1,2,3};

        System.out.println("Valor: ");
        try {
            System.out.println(numeros[3]);
        }catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Final");
    }
}
