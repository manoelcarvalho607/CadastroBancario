

/**
 *
 * @author manoel.carvalho
 */
public abstract class Pessoa  {
    
    private String nome;
    private String nomeBanco;
    private Double saldo;
    
    
    public  abstract String dadosBancarios();

   
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
