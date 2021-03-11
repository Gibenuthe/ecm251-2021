package benuthe.giovanni;

public class Main {

    public static void main(String[] args) {

	// Cria um objeto do tipo conta
        Conta c1;

    //Instancia um objeto conta
        c1 = new Conta();
            //Poderíamos escrever em uma unica linha:  Conta c1 = new Conta();

    //Pede para a conta exibir o saldo
        c1.visualizarSaldo();

    //Modificar o saldo
        c1.saldo = 100;

        c1.visualizarSaldo();

        Conta c2 = new Conta();
        c2.saldo = 123.0;

        c1.depositar(200);
        c2.depositar(100);

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        c1.sacar(50);
        c1.visualizarSaldo();

        //  if(c1.Sacar(4000)){
        //      System.out.println("Hoje tem playstation!");
        //  }
        //  else System.out.println("Deu ruim");

        if(c1.transferirDinheiro(c2, 250)){
            System.out.println("Transferencia feita com sucesso!");
        }
        else System.out.println("Não foi possível fazer a transferencia!");

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        c1.cliente = new Cliente();
        c2.cliente = new Cliente();

        System.out.println("nome do cliente: "+c1.cliente.nome);
        System.out.println("nome do cliente: "+c2.cliente.nome);



        System.out.println("C1: "+c1.toString());


    }
}
