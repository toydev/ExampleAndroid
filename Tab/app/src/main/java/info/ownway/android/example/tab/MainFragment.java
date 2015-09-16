package info.ownway.android.example.tab;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState
    ) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        View container = getView();
        if (container != null) {
            ViewPager pager = (ViewPager) container.findViewById(R.id.pager);
            pager.setAdapter(new TabPagerAdapeter(getChildFragmentManager()));
        }
    }

}
