package ExamenPractico;

public class Prueba {
    public static void main(String[]args){
        ProductoCongelado nuggets = new ProductoCongelado("01-12-2022","L1603004");
        ProductoFresco lechuga = new ProductoFresco("02-10-2022","L1610005");
        ProductoRefrigerado jugo = new ProductoRefrigerado("25-10-2022","L1609006");
        System.out.println("Sin datos. \nProducto Congelado: ");
        System.out.println("Fecha de caducidad: " + nuggets.getFechaCaducidad() + "\nNumero de Lote: " + nuggets.getNumeroLote()
                + "\nTemperatura Recomendada: " + nuggets.getTemperaturaRecomendada() + "C°");
        System.out.println();
        System.out.println("Producto Fresco: ");
        System.out.println("Fecha de caducidad: " + lechuga.getFechaCaducidad() + "\nNumero de Lote: " + lechuga.getNumeroLote()
                + "\nFecha de envasado: " + lechuga.getFechaEnvasado() + "\nPais de Origen: " + lechuga.getPaisDeOrigen());
        System.out.println();
        System.out.println("Producto Refrigerado: ");
        System.out.println("Fecha de caducidad: " + jugo.getFechaCaducidad() + "\nNumero de Lote: " + jugo.getNumeroLote()
                + "\nCodigo de supervision: " + jugo.getCodigoSupervisionAlimentaria());
        nuggets.setTemperaturaRecomendada(-18);
        lechuga.setFechaEnvasado("03-10-2021");
        lechuga.setPaisDeOrigen("Mexico");
        jugo.setCodigoSupervisionAlimentaria("L-3456");
        System.out.println();
        System.out.println("Con datos. \nProducto Congelado: ");
        System.out.println("Fecha de caducidad: " + nuggets.getFechaCaducidad() + "\nNumero de Lote: " + nuggets.getNumeroLote()
                + "\nTemperatura Recomendada: " + nuggets.getTemperaturaRecomendada() + "C°");
        System.out.println();
        System.out.println("Producto Fresco: ");
        System.out.println("Fecha de caducidad: " + lechuga.getFechaCaducidad() + "\nNumero de Lote: " + lechuga.getNumeroLote()
                + "\nFecha de envasado: " + lechuga.getFechaEnvasado() + "\nPais de Origen: " + lechuga.getPaisDeOrigen());
        System.out.println();
        System.out.println("Producto Refrigerado: ");
        System.out.println("Fecha de caducidad: " + jugo.getFechaCaducidad() + "\nNumero de Lote: " + jugo.getNumeroLote()
                + "\nCodigo de supervision: " + jugo.getCodigoSupervisionAlimentaria());
    }
}
