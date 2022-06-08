public class Estudante {
    private String nome;
    private double media;

    public Estudante(String nome, double media) {
        this.nome = nome;
        
        if(media>=0.0 && media<=100){
            this.media = media;
        }
        
    }

    public String gerarBoletim(){
        String conceito = "";

        if (media >= 90.0){
            conceito = "A";
        } else if (media >= 80.0){
            conceito = "B";
        } else if (media >= 70.0){
            conceito = "C";
        } else if (media >= 60.0){
            conceito = "D";
        } else {
            conceito = "F";
        }

        return conceito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        if(media>=0.0 && media<=100){
            this.media = media;
        }
    }
    


    

}