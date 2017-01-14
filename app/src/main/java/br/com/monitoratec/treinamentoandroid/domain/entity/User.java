package br.com.monitoratec.treinamentoandroid.domain.entity;

import com.google.gson.annotations.SerializedName;

/**
 *
 *User entity for GitHub API.
 *
 * @see <a href="https://developer.github.com/v3/users/#get-a-single-user">Get User</a>
 *
 * Created by danifao on 2017-01-11.
 */

public class User {
    public String login;
    @SerializedName("avatar_url")
    public String avatarUrl;
}