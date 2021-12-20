import java.util.*;

public class Handoff {
    public static String processInput(String inputLine) {
        // Aqui voce pode codificar seu algoritmo e processar a entrada.
        return inputLine;
    }

    // Este e um exemplo de processamento de entradas (inputs), sinta-se a vontade
    // para altera-lo conforme necessidade da questao.
    public static void main(String args[]) {

        int numeroDeVendedoresNaFila = 0;
        int contaEntrada = 1;
        int idDoVendedor = 0;
        int numeroDeClientes = 0;
        String idsVendedores = "";

        ArrayList<String> filaDeVendedoresPorID = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext() == true) {
            String inputLine = scanner.nextLine();

            if (contaEntrada == 1) {
                // A primeira linha contem o numero itens da fila de vendedores V
                numeroDeVendedoresNaFila = Integer.parseInt(inputLine);
                System.out.println("contaentrada = " + contaEntrada);
                contaEntrada++;
            }

            if (contaEntrada == 2) {
                // A segunda linha contem os ids dos vendedores separados por espaco no estado
                // inicial da fila F
                idsVendedores = inputLine;
                System.out.println("contaentrada = " + contaEntrada);
                contaEntrada++;
            }

            if (contaEntrada == 3) {
                // A terceira linha contem o numero de clientes cadastrados C
                numeroDeClientes = Integer.parseInt(inputLine);
                System.out.println("contaentrada = " + contaEntrada);
                contaEntrada++;
            }

            if (contaEntrada == 4) {
                // A quarta linha contem o ID de um dos vendedores X
                idDoVendedor = Integer.parseInt(inputLine);
                System.out.println("contaentrada = " + contaEntrada);
                contaEntrada++;
            }
        }

        System.out.println("vendedores na fila: " + numeroDeVendedoresNaFila);
        System.out.println("ids dos vendedores: " + idsVendedores);
        System.out.println("Clientes: " + numeroDeClientes);
        System.out.println("id de um vendedor: " + idDoVendedor);

    }
}