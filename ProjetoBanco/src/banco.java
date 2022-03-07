import java.util.List;

import java.util.List;
public class banco {

    private String nome;
    private List<conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public banco(List<conta> contas) {
        this.contas = contas;
    }
}
