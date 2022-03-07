public class contacorrente extends conta{

    public contacorrente(cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirextrato() {
        System.out.println("Extrato conta corrente: ");
        super.imprimirinfoscomuns();
        
    }








}
