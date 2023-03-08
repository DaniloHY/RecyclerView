package br.com.etecia.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> lstFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstFilmes = new ArrayList<>();

        lstFilmes.add(new Filmes("Beast", "Caçando um leão a solta", "Drama e Suspense", R.drawable.beast));
        lstFilmes.add(new Filmes("Croods", "Os croods", "Comédia e Ação", R.drawable.croods));
        lstFilmes.add(new Filmes("Croods", "Os croods", "Comédia e Ação", R.drawable.croods));
        lstFilmes.add(new Filmes("Croods", "Os croods", "Comédia e Ação", R.drawable.croods));
        lstFilmes.add(new Filmes("Croods", "Os croods", "Comédia e Ação", R.drawable.croods));
        lstFilmes.add(new Filmes("Croods", "Os croods", "Comédia e Ação", R.drawable.croods));
        lstFilmes.add(new Filmes("Croods", "Os croods", "Comédia e Ação", R.drawable.croods));
        lstFilmes.add(new Filmes("Croods", "Os croods", "Comédia e Ação", R.drawable.croods));

    }
}