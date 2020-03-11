package com.example.rxjavaretrofit.network.model;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("api_key")
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}
