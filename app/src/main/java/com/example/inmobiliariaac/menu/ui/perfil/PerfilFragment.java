package com.example.inmobiliariaac.menu.ui.perfil;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.inmobiliariaac.R;
import com.example.inmobiliariaac.databinding.FragmentPerfilBinding;

public class PerfilFragment extends Fragment {

    private PerfilViewModel vm;
    private FragmentPerfilBinding binding;

    public static PerfilFragment newInstance() {
        return new PerfilFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentPerfilBinding.inflate(inflater, container, false);
        return inflater.inflate(R.layout.fragment_perfil, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vm = new ViewModelProvider(this).get(PerfilViewModel.class);
        vm.leerPropietario(getActivity().getIntent());
        vm.getPropietarioData().observe(getViewLifecycleOwner(), propietario -> {
            binding.tvNombrePerfil.setText(propietario.getNombre());
            binding.tvApellidoPerfil.setText(propietario.getApellido());
            binding.tvEmailPerfil.setText(propietario.getEmail());
            binding.tvTelefonoPerfil.setText(propietario.getTelefono());
        });


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
   }

}