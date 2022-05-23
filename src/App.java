

/**
 *
 * @author manoel.carvalho
 */
public class App {
    
    public static void main(String[] args){
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
       
        pessoaFisica.setNomeBanco("Ebac");
        pessoaFisica.setNome("Manoel");
        pessoaFisica.setCpf("333.289.573-74");
        pessoaFisica.setSaldo(100d);
        
        String banco = pessoaFisica.getNomeBanco();
        String nomeClienteFisico = pessoaFisica.getNome();
        Double saldoContaFisica = pessoaFisica.getSaldo();
        String cpf = pessoaFisica.getCpf();
        
        pessoaJuridica.setNomeBanco("Java");
        pessoaJuridica.setNome("Silva");
        pessoaJuridica.setCnpj("33.457.859.0001-73");
        pessoaJuridica.setSaldo(2000d);
        
        String banco1 = pessoaJuridica.getNomeBanco();
        String nomeClienteJuridico = pessoaJuridica.getNome();
        Double saldoContaJuridica = pessoaJuridica.getSaldo();
        String cnpj = pessoaJuridica.getCnpj();
        
        System.out.println("");
        System.out.println("--- Dados bancário ----");
        System.out.println("Banco: "+ banco);
        System.out.println("Nome do cliente: "+ nomeClienteFisico);
        System.out.println("cpf: "+ cpf);
        System.out.println("Saldo da conta: $"+ saldoContaFisica);
        System.out.println("");
        System.out.println("---------------------------------");
        
        System.out.println("");
        System.out.println("--- Dados bancário ----");
        System.out.println("Banco: "+ banco1);
        System.out.println("Nome do cliente: "+ nomeClienteJuridico);
        System.out.println("Cnpj: "+ cnpj);
        System.out.println("Saldo da conta: $"+ saldoContaJuridica);
         
        
        
      
        
      
    }
    
}
