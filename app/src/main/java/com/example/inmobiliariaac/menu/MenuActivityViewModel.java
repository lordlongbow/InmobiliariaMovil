package com.example.inmobiliariaac.menu;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.inmobiliariaac.modelos.Propietario;

public class MenuActivityViewModel extends AndroidViewModel {
    private Context contexto;
    private MutableLiveData<Propietario> propietarioData;

    public MutableLiveData<Propietario> getPropietarioData() {
        return propietarioData;
    }

    public MenuActivityViewModel(@NonNull Application application) {
        super(application);
        contexto = application.getApplicationContext();
    }


}
