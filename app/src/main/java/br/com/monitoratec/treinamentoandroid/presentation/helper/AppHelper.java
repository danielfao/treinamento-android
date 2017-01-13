package br.com.monitoratec.treinamentoandroid.presentation.helper;

import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.text.TextUtils;
import android.widget.EditText;

import javax.inject.Inject;

import br.com.monitoratec.treinamentoandroid.R;

/**
 *
 * Useful class for app.
 *
 * Created by danifao on 2017-01-11.
 */

public final class AppHelper {
    private final Context mContext;

    @Inject
    public AppHelper(Context context) {
        mContext = context;
    }

    public boolean validateRequiredFields(TextInputLayout... fields) {
        boolean isValid = true;
        for (TextInputLayout field : fields) {
            EditText editText = field.getEditText();
            if (editText != null) {
                if (TextUtils.isEmpty(editText.getText())) {
                    isValid = false;
                    field.setErrorEnabled(true);
                    field.setError(mContext.getString(R.string.txt_required));
                } else {
                    field.setErrorEnabled(false);
                    field.setError(null);
                }
            } else {
                throw new RuntimeException("O TextInputLayout deve possuir um EditText.");
            }
        }
        return isValid;
    }
}