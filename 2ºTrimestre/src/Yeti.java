public class Yeti {
    //Atributos:
    private char color='b';
    private char sexo='m';
    private boolean hambriento=true;
    //Métodos:
    public void Yeti(){
    }
    void Yeti(char sexo){
        if(sexo=='m' || sexo=='h'){
            this.sexo=sexo;
        } else {
            System.out.println("El sexo introducido no es correcto.");
        }
    }
    public void Yeti(boolean hambriento){
        hambriento=this.hambriento;
    }
    public void Yeti(char sexo, boolean hambriento){
        if(sexo=='m' || sexo=='h'){
            this.sexo=sexo;
        } else {
            System.out.println("El sexo introducido no es correcto.");
        }
        hambriento=this.hambriento;
    }
    public void Yeti(char color, char sexo, boolean hambriento){
        this.color=color;
        if(sexo=='m' || sexo=='h'){
            this.sexo=sexo;
        } else {
            System.out.println("El sexo introducido no es correcto.");
        }
        this.hambriento=hambriento;
    }
    //Setters & Getters
    public void setColor(char color){
        this.color=color;
        System.out.println("El yeti es color "+color);
    }
    public char getSexo(){
        return sexo;
    }
    public void alimentarYeti(){
        if(hambriento){
            hambriento=!hambriento;
            System.out.println("Qué rica comida ñam ñam");
        } else {
            System.out.println("Ya he comido, no puedo mas, dejeme!");
        }
    }
    public void mostrarAtributos(){
        System.out.print("Soy un yeti "+sexo+" de color "+color+" y estoy ");
        if(hambriento){
            System.out.println("muy hambriento, ¡dame comidaaaa!");
        } else {
            System.out.println("muy saciado, no quiero nada de comer.");
        }
    }
}
