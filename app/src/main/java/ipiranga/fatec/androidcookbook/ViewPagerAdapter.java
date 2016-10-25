package ipiranga.fatec.androidcookbook;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;

import java.util.Locale;

/**
 * Created by turbiani on 19/10/16.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private Context context;
    private String titulosAbas[] = new String[] { "Serviços", "Informações", "Equipe" };

    public ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new FragmentViewPager1();
        }else if(position == 1){
            return new FragmentViewPager2();
        }else{
            return new FragmentViewPager3();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        return titulosAbas[position].toUpperCase(l);
    }

    public View getTabView(int position) {
        // Given you have a custom layout in `res/layout/custom_tab.xml` with a TextView and ImageView
        if(position == 0){
            View v = LayoutInflater.from(context).inflate(R.layout.servicos_tablayout_custom, null);
            return v;
        }else if(position == 1){
            View v = LayoutInflater.from(context).inflate(R.layout.informacoes_tablayout_custom, null);
            return v;
        }else{
            View v = LayoutInflater.from(context).inflate(R.layout.time_tablayout_custom, null);
            return v;
        }
    }
}
