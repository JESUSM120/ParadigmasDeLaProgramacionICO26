package ExamenPractico;

public class Producto {
    String fechaCaducidad, numeroLote;

    public Producto(String fechaCaducidad, String numeroLote){
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public void setFechaCaducidad(String fecha){
        fechaCaducidad = fecha;
    }

    public void setNumeroLote(String num){
        numeroLote = num;
    }

    public String getFechaCaducidad(){
        return fechaCaducidad;
    }

    public String getNumeroLote(){
        return numeroLote;
    }
}
