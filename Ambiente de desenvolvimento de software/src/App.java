public class App {
    public static void main(String[] args) throws Exception {
        Operações op = new Operações();
        int soma = op.add(5, 3);
        int subtração = op.subtract(10, 4);

        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + subtração);
    }
}