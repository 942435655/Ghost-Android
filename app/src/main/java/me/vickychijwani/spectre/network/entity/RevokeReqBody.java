package me.vickychijwani.spectre.network.entity;

import android.support.annotation.Nullable;
import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressWarnings({"WeakerAccess", "unused"})
public class RevokeReqBody {

    public static final String TOKEN_TYPE_ACCESS = "access_token";
    public static final String TOKEN_TYPE_REFRESH = "refresh_token";

    @StringDef({TOKEN_TYPE_ACCESS, TOKEN_TYPE_REFRESH})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TokenType {}

    @TokenType
    public final String tokenTypeHint;
    public final String token;
    public final String clientId;
    @Nullable public final String clientSecret;

    public RevokeReqBody(@TokenType String tokenTypeHint, String token, @Nullable String clientSecret) {
        this.tokenTypeHint = tokenTypeHint;
        this.token = token;
        this.clientId = "ghost-admin";
        this.clientSecret = clientSecret;
    }

}
