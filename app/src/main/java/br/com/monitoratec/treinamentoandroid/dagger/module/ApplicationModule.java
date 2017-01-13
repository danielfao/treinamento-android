package br.com.monitoratec.treinamentoandroid.dagger.module;

import android.app.Application;
import android.content.Context;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by danifao on 2017-01-12.
 */

@Module
public class ApplicationModule {

    private Application mApplication;

    public ApplicationModule(Application app) {
        mApplication = app;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    Context providesContext(Application app) {
        return app.getBaseContext();
    }

    @Provides
    @Singleton
    LocationManager providesLocationManager(Context context) {
        return (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
    }
}
