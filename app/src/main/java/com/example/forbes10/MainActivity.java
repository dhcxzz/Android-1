package com.example.forbes10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvForbes;
    private ArrayList<Forbes> list = new ArrayList<>();
    private void showSelectedHero(Forbes forbes) {
        Toast.makeText(this, "Kamu memilih " + forbes.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvForbes = findViewById(R.id.rv_forbes);
        rvForbes.setHasFixedSize(true);

        list.addAll(ForbesData.getListData());
        showRecyclerList();

        this.setTitle("10 Orang Terkaya Versi Forbes");
    }

    private void showRecyclerList(){
        rvForbes.setLayoutManager(new LinearLayoutManager(this));
        ListForbesAdapter listForbesAdapter = new ListForbesAdapter(list);
        rvForbes.setAdapter(listForbesAdapter);

        listForbesAdapter.setOnItemClickCallback(new ListForbesAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Forbes data) {
                showSelectedHero(data);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.about) {
            Intent intent = new Intent(MainActivity.this,AboutActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
