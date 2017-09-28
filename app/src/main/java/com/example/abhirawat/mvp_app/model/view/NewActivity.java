package com.example.abhirawat.mvp_app.model.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.abhirawat.mvp_app.R;
import com.example.abhirawat.mvp_app.model.presenter.ListInterface;
import com.example.abhirawat.mvp_app.model.presenter.ListMakerPresenter;

import java.util.ArrayList;
import java.util.List;

public class NewActivity extends AppCompatActivity implements ListInterface, AdapterView.OnItemClickListener {
    private ListMakerPresenter listPresenter;
    private List<String> list = new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        listPresenter = new ListMakerPresenter(this, list);
        listView = (ListView) findViewById(R.id.listItems);
        listView.setOnItemClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        listPresenter.onResume();

    }


    @Override
    public void setItems(List<String> items) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        listPresenter.setItemMessage(listView.getItemAtPosition(i).toString(), i);

    }
}
