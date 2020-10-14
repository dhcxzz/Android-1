package com.example.forbes10;

import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;

        import java.util.ArrayList;

public class SplashScreen extends AppCompatActivity {
    private RecyclerView rvForbes;
    private ArrayList<Forbes> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }
}