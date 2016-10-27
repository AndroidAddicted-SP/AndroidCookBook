package ipiranga.fatec.androidcookbook;

/**
 * Created by turbiani on 25/10/16.
 */

public class SubCategoriaServico {
    private String nomeSubCategoria;
    private String valorSubCategoria;
    private Boolean subCategoriaSelecionada;

    public SubCategoriaServico(String nomeSubCategoria, String valorSubCategoria, Boolean subCategoriaSelecionada) {
        this.nomeSubCategoria = nomeSubCategoria;
        this.valorSubCategoria = valorSubCategoria;
        this.subCategoriaSelecionada = subCategoriaSelecionada;
    }

    public String getNomeSubCategoria() {
        return nomeSubCategoria;
    }

    public void setNomeSubCategoria(String nomeSubCategoria) {
        this.nomeSubCategoria = nomeSubCategoria;
    }

    public String getValorSubCategoria() {
        return valorSubCategoria;
    }

    public void setValorSubCategoria(String valorSubCategoria) {
        this.valorSubCategoria = valorSubCategoria;
    }

    public Boolean isSubCategoriaSelecionada() {
        return subCategoriaSelecionada;
    }

    public void setSubCategoriaSelecionada(Boolean subCategoriaSelecionada) {
        this.subCategoriaSelecionada = subCategoriaSelecionada;
    }
}
