package br.com.monitoratec.treinamentoandroid.dagger;

import javax.inject.Singleton;

import br.com.monitoratec.treinamentoandroid.dagger.module.infrastructure.ManagerModule;
import br.com.monitoratec.treinamentoandroid.dagger.module.presentation.HelperModule;
import br.com.monitoratec.treinamentoandroid.dagger.module.ApplicationModule;
import br.com.monitoratec.treinamentoandroid.dagger.module.infrastructure.NetworkModule;
import br.com.monitoratec.treinamentoandroid.dagger.module.PreferenceModule;
import br.com.monitoratec.treinamentoandroid.dagger.module.infrastructure.ServiceModule;
import dagger.Component;

/**
 * Created by danifao on 2017-01-12.
 */

@Singleton
@Component(modules = {
        ApplicationModule.class,
        HelperModule.class,
        PreferenceModule.class,
        NetworkModule.class,
        ServiceModule.class,
        ManagerModule.class
})
public interface DiComponent {
    UiComponent uiComponent();
}