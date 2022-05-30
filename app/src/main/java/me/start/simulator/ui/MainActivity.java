package me.start.simulator.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.start.simulator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();
    }

    private void setupMatchesList() {
        //TODO Listar as partidas consumindo a Api.
    }

    private void setupMatchesRefresh() {
        //TODO: Atualizar as partidas na função de swipe.
    }

    private void setupFloatingActionButton() {
        //TODO: Criar evento de click e simulação de partidas.
    }
}
