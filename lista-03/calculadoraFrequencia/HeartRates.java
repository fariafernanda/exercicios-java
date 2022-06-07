package calculadoraFrequencia;

import java.time.Year;

public class HeartRates {
    private String nome;
    private String sobrenome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;


	public HeartRates(String nome, String sobrenome, int diaNascimento, int mesNascimento,
			int anoNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
	}

    public int calcularIdade(){
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - this.getAnoNascimento();

        return idade;
    }

    // Frequencia máxima = 220 - idade em anos
    public int calcularFrequenciaMaxima(){
        int freqMax = 220 - this.calcularIdade();

        return freqMax;
    }

    // Frequencia alvo = de 50 a 85% da frequência máxima
    public String calcularFrequenciaAlvo(){
        double minimo = 0.5 * this.calcularFrequenciaMaxima();
        double maximo = 0.85 * this.calcularFrequenciaMaxima();

        String intervaloFrequencia = String.format("De %.1f a %.1f", minimo, maximo);

        return intervaloFrequencia;
    }

    public String exibirDataNascimento(){
        String dataNascimento = String.format("%d/%d/%d", this.diaNascimento,this.mesNascimento,this.anoNascimento);
        return dataNascimento;
    }

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public int getDiaNascimento() {
		return diaNascimento;
	}


	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}


	public int getMesNascimento() {
		return mesNascimento;
	}


	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}


	public int getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

    

    

}