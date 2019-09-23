package com.example.equinoxcustomer.Login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.equinoxcustomer.Home.HomeActivity;
import com.example.equinoxcustomer.R;
import com.example.equinoxcustomer.databinding.ActivityUserLoginBinding;

public class UserLoginActivity extends AppCompatActivity {

    private ActivityUserLoginBinding binding;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_user_login);
        context = this;

        binding.btnLogin.setOnClickListener(v -> opnHomeActivity());

    }

    private void opnHomeActivity() {
        Intent homeIntent  = new Intent(context, HomeActivity.class);
        startActivity(homeIntent);
    }
}
