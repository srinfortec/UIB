
public class Teste {

	public static void main(String[] args) {

      Cliente cliente = new Cliente();
    
      cliente.nome = "Sergio";
      cliente.cpf = "123";
      
      Conta Conta = new Conta();
      Conta.numero = "123-";
      Conta.saldo = 100;
      Conta.cliente = cliente;
      Conta.cliente.cpf = "123";
      
      

      Conta.saldo = 100;
      
      System.out.println(cliente.cpf);
      System.out.println(cliente.nome);
    
      
      

	}

}
