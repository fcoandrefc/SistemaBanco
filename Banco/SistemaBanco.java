package Banco;

import java.util.Scanner;

import Contas.ContaPf;
import Contas.ContaPj;

public class SistemaBanco {
	
	public static void main(String[] args) {
		
		String Titular;
		String Conta;
		String Empresa;
		String Cnpj;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite Nome Titular");
		Titular = entrada.next();
		
		System.out.println("Digite Conta:");
		Conta = entrada.next();
		
		
		
		
		ContaPf contaPF = new ContaPf(Titular, Conta);
		
		System.out.println(contaPF.getNomeTitular());
		System.out.println(contaPF.getNumeroConta());
		
		//------------------------------------------
		
		System.out.println("Digite Nome Titular:");
		Titular = entrada.next();
		
		System.out.println("Digite Conta:");
		Conta = entrada.next();
		
		System.out.println("Digite Nome Empresa:");
		Empresa = entrada.next();
		
		System.out.println("Digite CNPJ:");
		Cnpj = entrada.next();
		
		
		
		ContaPj contaPj = new ContaPj(Titular, Conta, Empresa, Cnpj);
		
		System.out.println(contaPj.getNomeEmpresa());
		System.out.println(contaPj.getNomeTitular());
		System.out.println(contaPj.getNumeroConta());
		System.out.println(contaPj.getNumeroCNPJ());		
		
		
		entrada.close();
	}

}
