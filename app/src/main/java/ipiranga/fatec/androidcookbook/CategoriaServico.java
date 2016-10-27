package ipiranga.fatec.androidcookbook;

/**
 * Created by turbiani on 25/10/16.
 */

public class CategoriaServico {
    private String nomeCategoria;

    public CategoriaServico(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
}
