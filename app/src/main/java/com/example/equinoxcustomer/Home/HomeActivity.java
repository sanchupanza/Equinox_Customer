package com.example.equinoxcustomer.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.equinoxcustomer.Profile.UserProfileActivity;
import com.example.equinoxcustomer.R;
import com.example.equinoxcustomer.databinding.ActivityHomeBinding;

import io.reactivex.internal.operators.completable.CompletableNever;

public class HomeActivity extends AppCompatActivity  {


    private ActivityHomeBinding binding;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_home);
        context = this;

        binding.all7.setOnClickListener(v -> setAll());
        binding.schedule1.setOnClickListener(v -> scheduled());
        binding.collected3.setOnClickListener(v -> collected());
        binding.underProcess1.setOnClickListener(v -> underprocessing());
        binding.reportReady2.setOnClickListener(v -> reportReady());

        binding.ivProfile.setOnClickListener(v -> openProfileActivity());



    }

    private void openProfileActivity() {
        Intent profileIntent = new Intent(context, UserProfileActivity.class);
        startActivity(profileIntent);
    }

    private void reportReady() {
        binding.all7.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.schedule1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.collected3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.underProcess1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.reportReady2.setBackgroundColor(getResources().getColor(R.color.accent2));
    }

    private void underprocessing() {
        binding.all7.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.schedule1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.collected3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.underProcess1.setBackgroundColor(getResources().getColor(R.color.accent2));
        binding.reportReady2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }

    private void collected() {
        binding.all7.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.schedule1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.collected3.setBackgroundColor(getResources().getColor(R.color.accent2));
        binding.underProcess1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.reportReady2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }

    private void scheduled() {
        binding.all7.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.schedule1.setBackgroundColor(getResources().getColor(R.color.accent2));
        binding.collected3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.underProcess1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.reportReady2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }

    private void setAll() {
        binding.all7.setBackgroundColor(getResources().getColor(R.color.accent2));
        binding.schedule1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.collected3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.underProcess1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        binding.reportReady2.setBackgroundColor(getResources().getColor(R.color.colorAccent));

    }

}
