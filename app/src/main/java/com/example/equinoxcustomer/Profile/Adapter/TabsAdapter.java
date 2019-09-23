package com.example.equinoxcustomer.Profile.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.equinoxcustomer.Profile.HeadOffice_Frag;
import com.example.equinoxcustomer.Profile.Sites_Frag;

public class TabsAdapter extends FragmentPagerAdapter {
    int tabcount;

    public TabsAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabcount=tabCount;

    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new HeadOffice_Frag();
            case 1:
                return new Sites_Frag();
        }

        return null;
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
