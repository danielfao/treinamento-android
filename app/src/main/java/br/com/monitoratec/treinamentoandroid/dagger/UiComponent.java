package br.com.monitoratec.treinamentoandroid.dagger;

import br.com.monitoratec.treinamentoandroid.dagger.module.presentation.PresenterModule;
import br.com.monitoratec.treinamentoandroid.dagger.scope.PerActivity;
import br.com.monitoratec.treinamentoandroid.presentation.ui.auth.AuthActivity;
import dagger.Subcomponent;

/**
 * Created by danifao on 2017-01-13.
 */

@PerActivity
@Subcomponent(modules = {PresenterModule.class})
public interface UiComponent {
    void inject(AuthActivity activity);
}