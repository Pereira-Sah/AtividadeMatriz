package br.edu.fatecpg.exercicio2;
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] login=
		{{"login1@fatec.com", "senha1"},
		 {"login2@fatec.com", "senha2"},
		 {"login3@fatec.com", "senha3"},
		 {"login4@fatec.com", "senha4"},
		 {"login5@fatec.com", "senha5"},
		 {"login6@fatec.com", "senha6"}};
	
        System.out.print("Digite o login: ");
        String user = scan.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scan.nextLine();
        
        boolean acessoP = false;
       
        for (int i = 0; i < login.length; i++) {
            if (login[i][0].equals(user) && login[i][1].equals(senha)) {
                acessoP = true;
                break;
            }
        }
        
        if(acessoP) {
        	System.out.println("Acesso Permitido!");
        }else {
        	System.out.println("Acesso Negado!");
        }
}
}
