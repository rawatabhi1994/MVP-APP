package com.example.abhirawat.mvp_app.model.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.abhirawat.mvp_app.R;
import com.example.abhirawat.mvp_app.model.presenter.MainMessagePresenter;
import com.example.abhirawat.mvp_app.model.presenter.Navigate;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements Navigate {
    @InjectView(R.id.editName)
    EditText editName;
    @InjectView(R.id.editPassword)
    EditText editPassword;
    @InjectView(R.id.btnSet)
    Button btnSet;
    MainMessagePresenter mPresenter;
    String mesg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        mPresenter = new MainMessagePresenter();
    }

    @OnClick(R.id.btnSet)
    public void checkCredentials(View view) {
        String name = editName.getText().toString();
        String password = editPassword.getText().toString();
        mPresenter.checkDetails(this, name, password);


    }


    @Override
    public void failed() {
        Toast.makeText(this, "Login Failed Please Try Again", Toast.LENGTH_LONG).show();
    }

    @Override
    public void navigate() {
        startActivity(new Intent(this, NewActivity.class));
    }
}
