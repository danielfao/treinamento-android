package br.com.monitoratec.treinamentoandroid.util;

import android.util.Log;

import rx.Subscriber;

/**
 * Created by danifao on 2017-01-12.
 */

public abstract class MySubscriber<T> extends Subscriber<T>{

    private static final String TAG = MySubscriber.class.getSimpleName();

    @Override
    public void onCompleted() { }

    @Override
    public void onError(Throwable e) {
        String message = e.getMessage();
        Log.d(TAG, message, e);
        onError(message);
    }

    public abstract void onError(String message);
}
