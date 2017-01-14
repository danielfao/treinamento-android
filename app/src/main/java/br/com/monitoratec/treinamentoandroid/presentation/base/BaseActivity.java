package br.com.monitoratec.treinamentoandroid.presentation.base;

import android.support.v7.app.AppCompatActivity;

import br.com.monitoratec.treinamentoandroid.MyApplication;
import br.com.monitoratec.treinamentoandroid.dagger.UiComponent;

/**
 *
 * Base {@link AppCompatActivity}.
 *
 * Created by danifao on 2017-01-12.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected MyApplication getMyApplication() {
        return (MyApplication) getApplication();
    }

    protected UiComponent getDaggerUiComponent() {
        return this.getMyApplication().getDaggerUiComponent();
    }
}