package Biblioteca;

import java.util.Date;

public class Aluguel {
    private Usuario usuario;
    private Livro livro;
    private Date dataAluguel;
    private Date dataFinal; 
    private float multaDiaria;
    private float multaTotal;

    // Construtor
    public Aluguel(Usuario usuario, Livro livro, Date dataAluguel, Date dataFinal) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataAluguel = dataAluguel;
        this.dataFinal = dataFinal;
        this.multaDiaria = 5.0f; 
        this.multaTotal = 0.0f;
    }

    public void calcularMulta() {
        Date hoje = new Date(); 
        if (hoje.after(dataFinal)) {
            long diferencaMillis = hoje.getTime() - dataFinal.getTime();
            long diferencaDias = diferencaMillis / (1000 * 60 * 60 * 24);

            multaTotal = diferencaDias * multaDiaria;
        } else {
            multaTotal = 0.0f;
        }
    }

    public float getMultaTotal() {
        return multaTotal;
    }

}
