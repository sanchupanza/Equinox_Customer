package com.example.equinoxcustomer.Profile;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.equinoxcustomer.R;
import com.example.equinoxcustomer.databinding.SitesFragLayoutBinding;

public class Sites_Frag extends Fragment {


    UserProfileActivity activity;
    SitesFragLayoutBinding binding;
    private Context context;
    boolean isShow1 = false;

public Sites_Frag()
{

}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (getActivity() instanceof UserProfileActivity) {
            activity = (UserProfileActivity) getActivity();
            setHasOptionsMenu(true);
        }
        context = getContext();
        binding = DataBindingUtil.inflate(LayoutInflater.from(container.getContext()), R.layout.sites_frag_layout, container, false);




        binding.site1Show.setOnClickListener(v -> showSite1());






        return binding.getRoot();
    }

    private void showSite1() {
    if(!isShow1)
    {
        binding.site1Show.setText("Hide");
        binding.site1Constraint.setVisibility(View.VISIBLE);
        isShow1=true;
    }else
    {
        binding.site1Show.setText("Show");
        binding.site1Constraint.setVisibility(View.GONE);
        isShow1=false;
    }

    }
}
