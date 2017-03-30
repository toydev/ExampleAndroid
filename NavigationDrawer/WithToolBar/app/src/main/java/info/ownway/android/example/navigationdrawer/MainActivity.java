package info.ownway.android.example.navigationdrawer;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;

import info.ownway.android.example.navigationdrawer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActionBarDrawerToggle m_drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setSupportActionBar(binding.toolbar);
        binding.toolbar.setNavigationIcon(R.mipmap.ic_launcher);

        binding.drawer.addDrawerListener(m_drawerToggle = new ActionBarDrawerToggle(
                this, binding.drawer, binding.toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        ));
        m_drawerToggle.syncState();

        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }
}
