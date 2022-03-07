public abstract class conta implements iconta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected cliente cliente;

    public conta(cliente cliente){
        this.agencia = conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void saca(double valor) {
        saldo -= valor;
        
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
        
    }
    @Override
    public void transferir(double valor, conta contadestino) {
        this.saca(valor);
        contadestino.depositar(valor);
        
    }

    protected void imprimirinfoscomuns(){
        System.out.println(String.format("Títular: %s", this.cliente.getNome()));
        System.out.println(String.format("âgencia: %d", this.agencia));
        System.out.println(String.format("numero: %d", this.numero));
        System.out.println(String.format("saldo: %.2f", this.saldo));
    }

}
