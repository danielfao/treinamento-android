package br.com.monitoratec.treinamentoandroid;

import android.app.Application;

import br.com.monitoratec.treinamentoandroid.dagger.DaggerDiComponent;
import br.com.monitoratec.treinamentoandroid.dagger.DiComponent;
import br.com.monitoratec.treinamentoandroid.dagger.module.ApplicationModule;

/**
 * Created by danifao on 2017-01-12.
 */

public class MyApplication extends Application {
    private DiComponent mDiComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mDiComponent = DaggerDiComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public DiComponent getDaggerDiComponent() {
        return mDiComponent;
    }
}
