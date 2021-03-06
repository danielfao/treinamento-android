package br.com.monitoratec.treinamentoandroid.domain.entity;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

import br.com.monitoratec.treinamentoandroid.R;

/**
 * Status entity for GitHub Status API.
 *
 * @see <a href="https://status.github.com/api/last-message.json">Last Message</a>
 *
 * Created by danifao on 2017-01-09.
 */

public class Status {
    @SerializedName("status")
    public Type type;
    @SerializedName("body")
    public String message;
    @SerializedName("created_on")
    public Date createdOn;

    public enum Type {
        NONE(android.R.color.black, R.string.txt_loading),
        @SerializedName("good")
        GOOD(R.color.materialGreen500, R.string.txt_good),
        @SerializedName("minor")
        MINOR(R.color.materialOrange500, R.string.txt_minor),
        @SerializedName("major")
        MAJOR(R.color.materialRed500, R.string.txt_major);

        private int colorRes;
        private int messageRes;

        Type(int colorRes, int messageRes) {
            this.colorRes = colorRes;
            this.messageRes = messageRes;
        }

        public int getColorRes(){
            return colorRes;
        }
        public int getMessageRes(){ return messageRes; }
    }
}
