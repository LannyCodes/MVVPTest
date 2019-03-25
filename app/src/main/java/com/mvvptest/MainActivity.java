package com.mvvptest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mvvptest.databinding.ActivityMainBindingImpl;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBindingImpl binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);

//        User user = new User("FirstName", "LastName");
        User user = new User();
        user.firstName.set("HHHH");
        user.lastName.set("MMMMM");
        binding.setUser(user);
        binding.setHandlers(new MyHandlers());
    }
}
