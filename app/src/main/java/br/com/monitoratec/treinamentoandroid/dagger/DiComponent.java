package br.com.monitoratec.treinamentoandroid.dagger;

import javax.inject.Singleton;

import br.com.monitoratec.treinamentoandroid.BaseActivity;
import br.com.monitoratec.treinamentoandroid.MainActivity;
import br.com.monitoratec.treinamentoandroid.dagger.module.ApplicationModule;
import br.com.monitoratec.treinamentoandroid.dagger.module.NetworkModule;
import br.com.monitoratec.treinamentoandroid.dagger.module.PreferenceModule;
import br.com.monitoratec.treinamentoandroid.dagger.module.ServiceModule;
import dagger.Component;

/**
 * Created by danifao on 2017-01-12.
 */

@Singleton
@Component(modules = {
        ApplicationModule.class,
        PreferenceModule.class,
        NetworkModule.class,
        ServiceModule.class
})

public interface DiComponent {
    void inject (BaseActivity activity);
    void inject(MainActivity activity);
}