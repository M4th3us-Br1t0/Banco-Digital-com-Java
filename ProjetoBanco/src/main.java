public class main {
    
    public static void  main(String[] args){
        cliente matheus = new cliente();
        matheus.setNome("Matheus");

        conta cc = new  contacorrente(matheus);
        conta poupança = new contapoupança(matheus);

        cc.depositar(100);
        
        cc.transferir(100, poupança);

        cc.imprimirextrato();
        poupança.imprimirextrato();

    }
}
