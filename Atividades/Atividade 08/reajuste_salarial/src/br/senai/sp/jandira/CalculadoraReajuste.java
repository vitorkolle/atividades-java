package br.senai.sp.jandira;
import javax.swing.JOptionPane;
public class CalculadoraReajuste{
	public static void main(String[] args) {
		
		double salario;
		double salarioFinal;
		
		String strSalario = JOptionPane.showInputDialog(null, "Qual o seu salário?");
salario = Double.parseDouble(strSalario);
if (salario < 1500) {
	salarioFinal = salario * 15 / 100 + salario;
			JOptionPane.showConfirmDialog(null, "Seu salário terá um reajuste de 15%, então seu novo salário é: " + salarioFinal);
		}
else if (salario < 3000) {
			
	salarioFinal = salario * 10 /100 + salario;
JOptionPane.showConfirmDialog(null, "Seu salário terá um reajuste de 10%, então seu novo salário é: " + salarioFinal);
			
		}
if (salario >= 3000) {
	salarioFinal = salario * 5 / 100 + salario;
			JOptionPane.showConfirmDialog(null, "Seu salário terá um reajuste de 5%, então seu novo salário é: " + salarioFinal);
		}
	}
}
