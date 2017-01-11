package br.com.monitoratec.treinamentoandroid.domain.domain.entity;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

import br.com.monitoratec.treinamentoandroid.R;

/**
 * Entidade da API GitHub Status.
 *
 * @see <a href="https://status.github.com/api/last-message.json">Last Message</a>
 *
 * Created by danifao on 2017-01-09.
 */

public class Status {
    @SerializedName("status")
    public Type type;
    public String body;
    public Date created_on;

    public enum Type {
        @SerializedName("good")
        GOOD(R.color.materialGreen500),
        @SerializedName("minor")
        MINOR(R.color.materialOrange500),
        @SerializedName("major")
        MAJOR(R.color.materialRed500),
        NONE(android.R.color.black);

        private int colorRes;

        Type(int colorRes) {
            this.colorRes = colorRes;
        }

        public int getColorRes(){
            return colorRes;
        }
    }
}
