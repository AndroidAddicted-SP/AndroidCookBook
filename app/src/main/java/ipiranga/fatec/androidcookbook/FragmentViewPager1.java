package ipiranga.fatec.androidcookbook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eli on 12/10/16.
 */

public class FragmentViewPager1 extends Fragment {
    private List<Object> servicos;
    private RecyclerViewMultipleViewsAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_viewpager_1, container, false);

        populaServicos();

        adapter = new RecyclerViewMultipleViewsAdapter(servicos);

        RecyclerView rvServicos = (RecyclerView) view.findViewById(R.id.rvServicos);

        rvServicos.setAdapter(adapter);
        rvServicos.setLayoutManager(new LinearLayoutManager(this.getContext()));
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void populaServicos(){
        servicos = new ArrayList<Object>();

        servicos.add(new CategoriaServico("Cabelo"));
        servicos.add(new SubCategoriaServico("Corte Feminino", "R$40,00", false));
        servicos.add(new SubCategoriaServico("Corte Masculino", "R$35,00", false));
        servicos.add(new SubCategoriaServico("Escova", "R$30,00", false));
        servicos.add(new SubCategoriaServico("Hidratação", "R$25,00", false));
        servicos.add(new SubCategoriaServico("Coloração", "R$20,00", false));
        servicos.add(new SubCategoriaServico("Penteados", "R$60,00", false));

        servicos.add(new CategoriaServico("Manicure e Pedicure"));
        servicos.add(new SubCategoriaServico("Pé", "R$40,00", false));
        servicos.add(new SubCategoriaServico("Mão", "R$35,00", false));
        servicos.add(new SubCategoriaServico("Cutícula", "R$30,00", false));

        servicos.add(new CategoriaServico("Massagem"));
        servicos.add(new SubCategoriaServico("Desportiva", "R$40,00", false));
        servicos.add(new SubCategoriaServico("Shiatsu", "R$35,00", false));
        servicos.add(new SubCategoriaServico("Drenagem Linfática", "R$30,00", false));
        servicos.add(new SubCategoriaServico("Reflexologia", "R$25,00", false));
        servicos.add(new SubCategoriaServico("Clássica", "R$20,00", false));
    }
}
