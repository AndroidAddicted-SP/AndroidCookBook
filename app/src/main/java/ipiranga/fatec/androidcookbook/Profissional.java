package ipiranga.fatec.androidcookbook;

/**
 * Created by turbiani on 27/10/16.
 */

public class Profissional {
    private String nome;
    private String profissao;
    private String nomeFoto;

    public Profissional(String nome, String profissao, String nomeFoto) {
        this.nome = nome;
        this.profissao = profissao;
        this.nomeFoto = nomeFoto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNomeFoto() {
        return nomeFoto;
    }

    public void setNomeFoto(String nomeFoto) {
        this.nomeFoto = nomeFoto;
    }
}
