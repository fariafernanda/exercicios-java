package healthProfile;

import java.time.Year;

public class HealthProfile {
    protected String nome;
    protected String sobrenome;
    protected int diaNascimento;
    protected int mesNascimento;
    protected int anoNascimento;
    protected double altura;
    protected double peso;

    
    public HealthProfile(String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento,
            double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public static void gerarRelatorioSaude(HealthProfile paciente){
        gerarInformacoesBasicas(paciente);
        exibirDataNascimento(paciente);
        calcularIdade(paciente);
        calcularFrequenciaAlvo(paciente);
        calcularFrequenciaAlvo( paciente);
        calcularIMC(paciente);
    }

    public static double calcularIMC(HealthProfile paciente){
        double peso = paciente.getPeso();
        double altura = paciente.getAltura();

        double imc = peso / (altura * altura);

        System.out.printf("Imc: %.2f%n", imc);

        return imc;
    }

    public static int calcularIdade(HealthProfile paciente){
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - paciente.getAnoNascimento();

        System.out.printf("Idade: %d%n", idade);
        return idade;
    }

    public static int calcularFrequenciaMaxima(HealthProfile paciente){
        int idade = calcularIdade(paciente);
        int freqMax = 220 - idade;
        System.out.printf("Frequência Cardíaca Máxima: %d%n", freqMax);
        return freqMax;
    }

    public static void calcularFrequenciaAlvo(HealthProfile paciente){
        int freqMax = calcularFrequenciaMaxima(paciente);
        double minimo = 0.5 * freqMax;
        double maximo = 0.85 * freqMax;

        System.out.printf("Intervalo de frequência cardíaca alvo: de %.1f a %.1f %n", minimo, maximo);

    }

    public static void gerarInformacoesBasicas(HealthProfile paciente){
        System.out.printf("Nome: %s %s%n", paciente.getNome(), paciente.getSobrenome());
        
    }

    public static void exibirDataNascimento(HealthProfile paciente){
        System.out.printf("%nData de nascimento: %d/%d/%d", paciente.getDiaNascimento(), paciente.getMesNascimento(), paciente.getAnoNascimento());
       
    }


    public String getNome() {return nome;}


    public void setNome(String nome) {this.nome = nome;}


    public String getSobrenome() { return sobrenome; }


    public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}


    public int getDiaNascimento() {return diaNascimento;}


    public void setDiaNascimento(int diaNascimento) {this.diaNascimento = diaNascimento;}


    public int getMesNascimento() {return mesNascimento;}


    public void setMesNascimento(int mesNascimento) {this.mesNascimento = mesNascimento;}


    public int getAnoNascimento() { return anoNascimento;}


    public void setAnoNascimento(int anoNascimento) {this.anoNascimento = anoNascimento; }


    public double getAltura() {return altura;}


    public void setAltura(double altura) {this.altura = altura;}


    public double getPeso() { return peso; }


    public void setPeso(double peso) { this.peso = peso; }

    
}