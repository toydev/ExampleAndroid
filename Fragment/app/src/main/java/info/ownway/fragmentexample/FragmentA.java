package info.ownway.fragmentexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import info.ownway.fragmentexample.databinding.FragmentABinding;

public class FragmentA extends BaseFragment {
    private FragmentABinding m_binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(getClass().getName(), "onCreateView ... start");
        try {
            return inflater.inflate(R.layout.fragment_a, container, false);
        } finally {
            Log.d(getClass().getName(), "onCreateView ... finish");
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d(getClass().getName(), "onActivityCreated ... start");
        try {
            super.onActivityCreated(savedInstanceState);

            getActionBar().setTitle("Fragment A");

            m_binding = FragmentABinding.bind(getView());
        } finally {
            Log.d(getClass().getName(), "onActivityCreated ... finish");
        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

        inflater.inflate(R.menu.fragment_a, menu);
    }
}
