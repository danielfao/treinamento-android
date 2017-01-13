package br.com.monitoratec.treinamentoandroid.dagger.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by danifao on 2017-01-13.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity { }