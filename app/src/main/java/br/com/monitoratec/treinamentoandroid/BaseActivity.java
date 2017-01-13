package br.com.monitoratec.treinamentoandroid;

import android.support.v7.app.AppCompatActivity;

import br.com.monitoratec.treinamentoandroid.dagger.DiComponent;

/**
 * Created by danifao on 2017-01-12.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected MyApplication getMyApplication() {
        return (MyApplication) getApplication();
    }

    protected DiComponent getDaggerDiComponent() {
        return this.getMyApplication().getDaggerDiComponent();
    }

}
