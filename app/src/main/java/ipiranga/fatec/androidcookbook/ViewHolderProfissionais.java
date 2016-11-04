package ipiranga.fatec.androidcookbook;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by turbiani on 27/10/16.
 */

public class ViewHolderProfissionais extends RecyclerView.ViewHolder {
    private TextView nomeProfissional;
    private TextView nomeProfissao;
    private ImageView fotoPerfil;

    public ViewHolderProfissionais(View itemView) {
        super(itemView);
        nomeProfissional = (TextView) itemView.findViewById(R.id.txtNomeProfissional);
        nomeProfissao    = (TextView) itemView.findViewById(R.id.txtProfissao);
        fotoPerfil       = (ImageView) itemView.findViewById(R.id.fotoPerfil);
    }

    public ViewHolderProfissionais(View itemView, TextView nomeProfissional, TextView nomeProfissao, ImageView fotoPerfil) {
        super(itemView);
        this.nomeProfissional = nomeProfissional;
        this.nomeProfissao = nomeProfissao;
        this.fotoPerfil = fotoPerfil;
    }

    public TextView getNomeProfissional() {
        return nomeProfissional;
    }

    public void setNomeProfissional(TextView nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }

    public TextView getNomeProfissao() {
        return nomeProfissao;
    }

    public void setNomeProfissao(TextView nomeProfissao) {
        this.nomeProfissao = nomeProfissao;
    }

    public ImageView getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(ImageView fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
}
