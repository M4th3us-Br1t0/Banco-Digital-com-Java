public class contapoupança extends conta{

    public contapoupança(cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirextrato() {
        System.out.println("Extrato conta poupança: ");
        super.imprimirinfoscomuns();

    }

}
