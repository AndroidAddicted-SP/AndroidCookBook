package ipiranga.fatec.androidcookbook;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by eliete on 8/31/16.
 */
public class RecyclerViewProfissionaisAdapter extends RecyclerView.Adapter<ViewHolderProfissionais> {

    private List<Profissional> profissionais;
    private Context context;

    public RecyclerViewProfissionaisAdapter(List<Profissional> profissionais, Context context) {
        this.profissionais = profissionais;
        this.context = context;
    }

    @Override
    public ViewHolderProfissionais onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.profissional_item, parent, false);
        return new ViewHolderProfissionais(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderProfissionais holder, int position) {
        Profissional profissional = this.profissionais.get(position);
        if (profissional != null){
            holder.getNomeProfissao().setText(profissional.getProfissao());
            holder.getNomeProfissional().setText(profissional.getNome());

//            Drawable drawable = this.context.getDrawable(this.context.getResources()
//                    .getIdentifier(profissional.getNomeFoto(), "drawable", this.context.getPackageName()));
//
//            holder.getFotoPerfil().setImageDrawable(drawable);
        }
    }

    @Override
    public int getItemCount() {
        return profissionais.size();
    }


}
