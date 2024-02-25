package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int NumTV;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        NumTV++;

    }

    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setCanal(int canal){
        if (canal >= 1 && canal <= 120){
            this.canal = canal;
        }
    }
    public int getCanal(){
        return canal;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPrecio(){
        return precio;
    }

    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    public int getVolumen(){
        return volumen;
    }

    public void setControl(Control control){
        this.control = control;
    }
    public Control getControl(){
        return control;
    }

    public void setNumTV(int numTV){
        this.NumTV = numTV;
    }
    public int getNumTV(){
        return numTV;
    }

    public boolean getEstado(){
        return estado;
    }


    public void turnOn(){
        estado = true;
    }

    public void turnOff(){
        estado = false;
    }

    public void canalUp(){
        if (estado == true && canal >= 1 && canal < 120){
            canal++;
        }
    }
    public void canalDown(){
        if (estado == true && canal > 1 && canal <= 120){
            canal--;
        }
    }

    public void volumenUp() {
        if (estado == true && volumen >= 0 && volumen < 7) {
            volumen++;
        }
    }
    public void volumenDown(){
        if (estado == true && volumen > 0 && volumen >= 7) {
            volumen--;
        }
    }

}