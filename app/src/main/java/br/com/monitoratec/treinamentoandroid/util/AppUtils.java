package br.com.monitoratec.treinamentoandroid.util;

import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.text.TextUtils;
import android.widget.EditText;

import br.com.monitoratec.treinamentoandroid.R;

/**
 * Created by danifao on 2017-01-11.
 */

public final class AppUtils {
    private AppUtils() { }

    public static boolean validateRequiredFields(Context context, TextInputLayout... fields){
        boolean isValid = true;
        for (TextInputLayout field : fields){
            EditText editText = field.getEditText();
            if (editText != null){
                if (TextUtils.isEmpty(editText.getText())){
                    isValid = false;
                    field.setErrorEnabled(true);
                    field.setError(context.getString(R.string.txt_required));
                } else {
                    field.setErrorEnabled(false);
                    field.setError(null);
                }
            } else {
                throw new RuntimeException("O TextInputLayout deve possuir um EditText");
            }
        }
        return isValid;
    }
}
