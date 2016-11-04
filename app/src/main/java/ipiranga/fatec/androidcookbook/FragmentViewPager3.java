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

public class FragmentViewPager3 extends Fragment {
    private List<Profissional> profissionais;
    private RecyclerViewProfissionaisAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_viewpager_3, container, false);

        populaProfissionais();

        adapter = new RecyclerViewProfissionaisAdapter(profissionais, this.getContext());

        RecyclerView rvProfissionais = (RecyclerView) rootView.findViewById(R.id.rvProfissionais);

        rvProfissionais.setAdapter(adapter);
        rvProfissionais.setLayoutManager(new LinearLayoutManager(this.getContext()));

        return rootView;

    }

    private void populaProfissionais(){
        profissionais = new ArrayList<Profissional>();

        profissionais.add(new Profissional("Adriana Ferreira", "Cabeleireira", ""));
        profissionais.add(new Profissional("Marcio Vasquez", "Cabeleireiro", ""));
        profissionais.add(new Profissional("Valéria Souza de Oliveira", "Cabeleireira", ""));
        profissionais.add(new Profissional("Reginaldo", "Barbeiro", ""));
        profissionais.add(new Profissional("Rosana de Albuquerque", "Manicure", ""));
        profissionais.add(new Profissional("Drika Ferrari", "Massagista", ""));
        profissionais.add(new Profissional("Adriana Ferreira", "Cabeleireira", ""));

    }
}
