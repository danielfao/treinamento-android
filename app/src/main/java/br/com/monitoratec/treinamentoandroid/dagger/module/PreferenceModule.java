package br.com.monitoratec.treinamentoandroid.dagger.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Named;
import javax.inject.Singleton;

import br.com.monitoratec.treinamentoandroid.R;
import dagger.Module;
import dagger.Provides;

/**
 *
 * Module for {@link SharedPreferences} instance(s).
 *
 * Created by danifao on 2017-01-12.
 */

@Module
public class PreferenceModule {

    @Provides
    @Singleton
    SharedPreferences providesSharedPreferences(Context context) {
        final String fileName = context.getString(R.string.sp_file);
        return context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
    }

    @Provides
    @Singleton
    @Named("non-secret")
    SharedPreferences providesSharedPreferencesDefault(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
}