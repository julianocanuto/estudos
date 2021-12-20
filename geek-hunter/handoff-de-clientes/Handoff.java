import java.util.*;
import java.util.ArrayList;
import java.util.Arrays.*;
import java.util.stream.Collectors;

public class Handoff {

    public static void main(String args[]) {

        int numeroDeVendedoresNaFila = 0;
        int idDoVendedor = 0;
        int numeroDeClientes = 0;
        String filaDeVendedoresPorIdInput = "";
        List<String> filaDeVendedoresPorID = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        numeroDeVendedoresNaFila = Integer.parseInt(scanner.nextLine());

        filaDeVendedoresPorIdInput = new String(scanner.nextLine());
        filaDeVendedoresPorID = new ArrayList<String>(Arrays.asList(filaDeVendedoresPorIdInput.split(" ")));

        numeroDeClientes = Integer.parseInt(scanner.nextLine());

        idDoVendedor = Integer.parseInt(scanner.nextLine());

        scanner.close();

        // System.out.println("vendedores na fila: " + numeroDeVendedoresNaFila);
        // System.out.println("Clientes: " + numeroDeClientes);
        // System.out.println("id de um vendedor: " + idDoVendedor);

        Collections.rotate(filaDeVendedoresPorID, -numeroDeClientes);
        // System.out.println("ids dos vendedores [apos rotate]: " +
        // filaDeVendedoresPorID);
        // System.out.println("id primeira posição: " + filaDeVendedoresPorID.get(0));
        // System.out.println("clientes para cadastro: " +
        // filaDeVendedoresPorID.indexOf(String.valueOf(idDoVendedor)));
        System.out.println(filaDeVendedoresPorID.get(0));
        System.out.println(filaDeVendedoresPorID.indexOf(String.valueOf(idDoVendedor)));
    }
}