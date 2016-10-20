package ipiranga.fatec.androidcookbook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by eli on 12/10/16.
 */

public class FragmentViewPager2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_viewpager_2, container, false);
        return rootView;

    }
}
