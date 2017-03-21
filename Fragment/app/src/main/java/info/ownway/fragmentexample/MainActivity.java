package info.ownway.fragmentexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import info.ownway.fragmentexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding m_binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(getClass().getName(), "onCreate ... start");
        try {
            super.onCreate(savedInstanceState);

            Log.d(getClass().getName(), "onCreate ... setContentView");
            m_binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

            setSupportActionBar(m_binding.toolbar);

            if (savedInstanceState == null) {
                Log.d(getClass().getName(), "onCreate ... set fragment");
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(
                        R.id.container_fragment1,
                        new FragmentA());
                transaction.replace(
                        R.id.container_fragment2,
                        new FragmentB());
                transaction.commit();
            }
        } finally {
            Log.d(getClass().getName(), "onCreate ... finish");
        }
    }
}
