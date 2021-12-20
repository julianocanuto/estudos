import java.util.*;

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

        Collections.rotate(filaDeVendedoresPorID, -numeroDeClientes);

        System.out.println(filaDeVendedoresPorID.get(0));
        System.out.println(filaDeVendedoresPorID.indexOf(String.valueOf(idDoVendedor)));
    }
}