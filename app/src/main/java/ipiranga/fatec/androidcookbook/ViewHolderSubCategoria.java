package ipiranga.fatec.androidcookbook;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by turbiani on 27/10/16.
 */

public class ViewHolderSubCategoria extends RecyclerView.ViewHolder {
    private TextView nomeSubCategoria;
    private TextView valorSubCategoria;
    private CheckBox subCategoriaSelecionada;

    public ViewHolderSubCategoria(View itemView) {
        super(itemView);
        nomeSubCategoria        = (TextView) itemView.findViewById(R.id.txtSubCategoria);
        valorSubCategoria       = (TextView) itemView.findViewById(R.id.txtSubCategoria);
        subCategoriaSelecionada = (CheckBox) itemView.findViewById(R.id.checkboxSubCategoria);
    }

    public TextView getNomeSubCategoria() {
        return nomeSubCategoria;
    }

    public void setNomeSubCategoria(TextView nomeSubCategoria) {
        this.nomeSubCategoria = nomeSubCategoria;
    }

    public TextView getValorSubCategoria() {
        return valorSubCategoria;
    }

    public void setValorSubCategoria(TextView valorSubCategoria) {
        this.valorSubCategoria = valorSubCategoria;
    }

    public CheckBox getSubCategoriaSelecionada() {
        return subCategoriaSelecionada;
    }

    public void setSubCategoriaSelecionada(CheckBox subCategoriaSelecionada) {
        this.subCategoriaSelecionada = subCategoriaSelecionada;
    }
}
