import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
// TODO:conhecer e importar  a classe Scanner.
// exibir as mensagens  para uso do usuário.
//obter pelo scanner os valores digitados pelo usuário;
    Scanner scanner = new Scanner(System.in);  
   
    int conta;
    double saldo;
       
    System.out.print("Por favor, digite seu nome: ");
    String nome = scanner.next();

    System.out.print("Por favor, digite seu sobrenome: ");
    String sobrenome = scanner.next();

    System.out.print("Por gentileza, digite o número da sua agencia: ");
    String agencia = scanner.next();
    
    System.out.print("Digite o número da sua conta: ");
    conta = scanner.nextInt();

    System.out.print("Digite seu saldo: " );
    saldo = scanner.nextDouble();

        
    
    System.out.println("Olá " + nome + " "+ sobrenome + ", obrigado por criar uma conta em nosso banco, sua agencia é: " + agencia + ","); 
    System.out.print("conta: " + conta + " e seu saldo: " + saldo + " Reais," + " já está disponível para saque!"); 






    }
}
