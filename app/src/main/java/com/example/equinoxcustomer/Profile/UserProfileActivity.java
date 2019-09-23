package com.example.equinoxcustomer.Profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.ViewPager;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;

import com.example.equinoxcustomer.Profile.Adapter.TabsAdapter;
import com.example.equinoxcustomer.R;
import com.example.equinoxcustomer.databinding.ActivityUserProfileBinding;
import com.google.android.material.tabs.TabLayout;


public class UserProfileActivity extends AppCompatActivity {

    private String[] fragtitle = {"Head Office" , "Sites"};
    ViewPager viewPager;
    private ActivityUserProfileBinding binding;
    private Context context;



    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_user_profile);
        context = this;
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        }



        viewPager = findViewById(R.id.profile_viewpager);

        TabLayout tabLayout = binding.tabLayout;
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        for (int i = 0; i < 2; i++) {
            tabLayout.addTab(tabLayout.newTab().setText(fragtitle[i]));
        }
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        TabsAdapter tabsAdapter = new TabsAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(tabsAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




    }


}