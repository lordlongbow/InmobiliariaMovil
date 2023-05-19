package com.example.inmobiliariaac.menu.ui.perfil;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.inmobiliariaac.modelos.Propietario;
import com.example.inmobiliariaac.request.ApiClient;

public class PerfilViewModel extends AndroidViewModel {

    private Context contexto;
    private MutableLiveData<Propietario> propietarioData;
    private  ApiClient apiClient = new ApiClient().getApi();

    public LiveData<Propietario> getPropietarioData() {
        return propietarioData;
    }

    public PerfilViewModel(@NonNull Application application) {
        super(application);
        contexto = application.getApplicationContext();
    }

public void leerPropietario(Intent intent){
        boolean leido = intent.getBooleanExtra("leido",false);
        if(leido){
            Propietario propietario = apiClient.obtenerUsuarioActual();
            propietarioData.setValue(propietario);
        }

}

}