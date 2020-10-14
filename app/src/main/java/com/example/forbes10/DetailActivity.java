package com.example.forbes10;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;

public class DetailActivity extends AppCompatActivity {
    public static final String NAMA = "extra_name";
    public static final String PHOTO = "extra_photo";
    public static final String AGE = "extra_age";
    public static final String CITIZEN = "extra_citizen";
    public static final String WEALTH = "extra_wealth";
    public static final String PARAGRAF = "extra_paragraf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView DataDiterima = findViewById(R.id.nama);
        String nama = getIntent().getStringExtra(NAMA);
        DataDiterima.setText(nama);

        int foto = getIntent().getIntExtra(PHOTO, 0); // ambil nilai yang dikirim dari adapter khusus untuk PHOTO gunakan int

        ImageView layoutFoto = findViewById(R.id.img_item_photo); // ambil id lokasi tag xml yang akan di isi nilai

        Glide.with(this)
                .load(foto)
                .apply(new RequestOptions().override(100, 100))
                .override(Target.SIZE_ORIGINAL)
                .into(layoutFoto); // gunakan glide untuk menampilkan gambar

        TextView DataDiterima2 = findViewById(R.id.umur);
        String umur = getIntent().getStringExtra(AGE);
        DataDiterima2.setText(umur);

        TextView DataDiterima3 = findViewById(R.id.wealth);
        String wealth = getIntent().getStringExtra(WEALTH);
        DataDiterima3.setText(wealth);

        TextView DataDiterima4 = findViewById(R.id.paragraf);
        String paragraf = getIntent().getStringExtra(PARAGRAF);
        DataDiterima4.setText(paragraf);

    }
}