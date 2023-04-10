import java.util.Scanner;
//Exercicio 12: endo como dados de entrada a altura de uma pessoa,
//construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
// (72.7*altura) - 58
class Main {
public static void main(String[] args){
//Declaração de variáveis
double altura;
double pesoIdeal;
//Fazer a entrada de dados
Scanner teclado = new Scanner(System.in);
System.out.println("Digite sua altura: ");
altura = teclado.nextDouble();
//Fazer o calculo
pesoIdeal = (72.7 * altura) - 58;
//Mostrar o resultado
System.out.println("Seu peso ideal é: " + pesoIdeal);
  }
}