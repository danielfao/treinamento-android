package br.com.monitoratec.treinamentoandroid.dagger.module.presentation;

import android.content.Context;

import br.com.monitoratec.treinamentoandroid.presentation.helper.AppHelper;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

/**
 * Created by danifao on 2017-01-13.
 */

@Module
public class HelperModule {
    @Provides
    @Reusable
    AppHelper provideTextHelper(Context context) {
        return new AppHelper(context);
    }
}