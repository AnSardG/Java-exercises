public enum Consumo {
    //Identificadores:
    A(100F), B(80F), C(60F), D(50F), E(30F), F(10F);
    
    //Atributos:
    private float precio;

    //Constructores:
    private Consumo(float precio) {
        this.precio = precio;
    }
    
    //Métodos:
    public float getPrecio(){
        return precio;
    }
}
