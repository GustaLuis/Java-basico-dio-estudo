import java.util.Scanner;
public class CondiçãoTernária {
    //cenário 1
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        double nota = scanner.nextInt();

        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

    //cenário 2
    double nota2 = 6.5;
    String segundoResultado = nota2 >=7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperação" : "Reprovado";
    System.out.println(segundoResultado);

}
}