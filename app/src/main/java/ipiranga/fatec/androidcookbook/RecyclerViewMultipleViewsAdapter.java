package ipiranga.fatec.androidcookbook;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by turbiani on 27/10/16.
 */

public class RecyclerViewMultipleViewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Object> categoriasServico;
    private final int CATEGORIA = 0, SUBCATEGORIA = 1;

    public RecyclerViewMultipleViewsAdapter(List<Object> categoriaServicos) {
        this.categoriasServico = categoriaServicos;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (viewType) {
            case CATEGORIA:
                View v1 = inflater.inflate(R.layout.servico_categoria_item, viewGroup, false);
                viewHolder = new ViewHolderCategoria(v1);
                break;
            case SUBCATEGORIA:
                View v2 = inflater.inflate(R.layout.servico_sub_categoria_item, viewGroup, false);
                viewHolder = new ViewHolderSubCategoria(v2);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        switch (viewHolder.getItemViewType()) {
            case CATEGORIA:
                ViewHolderCategoria viewHolderCategoria = (ViewHolderCategoria) viewHolder;
                configureViewHolderCategoria(viewHolderCategoria, position);
                break;
            case SUBCATEGORIA:
                ViewHolderSubCategoria viewHolderSubCategoria = (ViewHolderSubCategoria) viewHolder;
                configureViewHolderSubCategoria(viewHolderSubCategoria, position);
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (categoriasServico.get(position) instanceof CategoriaServico) {
            return CATEGORIA;
        } else if (categoriasServico.get(position) instanceof SubCategoriaServico) {
            return SUBCATEGORIA;
        }
        return -1;
    }

    @Override
    public int getItemCount() {
        return this.categoriasServico.size();
    }

    private void configureViewHolderCategoria(ViewHolderCategoria viewHolderCategoria, int position) {
        try {
            CategoriaServico categoriaServico = (CategoriaServico) categoriasServico.get(position);
            if(categoriaServico!=null){
                viewHolderCategoria.getNomeCategoria().setText(categoriaServico.getNomeCategoria());
            }
        }catch (ClassCastException e ){
            e.printStackTrace();
        }
    }

    private void configureViewHolderSubCategoria(ViewHolderSubCategoria viewHolderSubCategoria, int position) {
        try {
            SubCategoriaServico subCategoriaServico = (SubCategoriaServico) categoriasServico.get(position);
            if(subCategoriaServico!=null){
                viewHolderSubCategoria.getNomeSubCategoria().setText(subCategoriaServico.getNomeSubCategoria());
                viewHolderSubCategoria.getValorSubCategoria().setText(subCategoriaServico.getValorSubCategoria());
                viewHolderSubCategoria.getSubCategoriaSelecionada().setChecked(subCategoriaServico.isSubCategoriaSelecionada());
            }
        }catch (ClassCastException e ){
            e.printStackTrace();
        }
    }
}
