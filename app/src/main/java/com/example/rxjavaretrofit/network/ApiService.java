package com.example.rxjavaretrofit.network;

import com.example.rxjavaretrofit.network.model.Note;
import com.example.rxjavaretrofit.network.model.User;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiService {
    //register new user
    @FormUrlEncoded
    @POST("notes/user/register")
    Single<User> register(@Field("device_id") String deviceId);

    //create new notes
    @FormUrlEncoded
    @POST("notes/new")
    Single<User> createNote(@Field("note") String note);

    @GET("notes/all")
    Single<List<Note>> getAllNotes();

    //update single note
    @FormUrlEncoded
    @PUT("notes/{id}")
    Completable updateNote(@Path("id") int noteId, @Field("note") String note);

    //Delete note
    @DELETE("notes/{id}")
    Completable deleteNote(@Path("id") int noteId);


}
