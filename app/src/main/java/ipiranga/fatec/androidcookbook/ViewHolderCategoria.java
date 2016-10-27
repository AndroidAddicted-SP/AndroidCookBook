package ipiranga.fatec.androidcookbook;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by turbiani on 27/10/16.
 */

public class ViewHolderCategoria extends RecyclerView.ViewHolder{
    private TextView nomeCategoria;


    public ViewHolderCategoria(View itemView) {
        super(itemView);
        nomeCategoria = (TextView) itemView.findViewById(R.id.txtCategoria);
    }

    public TextView getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(TextView nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
}
