package ipiranga.fatec.androidcookbook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;

/**
 * Created by turbiani on 19/10/16.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private String titulosAbas[] = new String[] { "Serviços", "Informações", "Equipe" };

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
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
}
