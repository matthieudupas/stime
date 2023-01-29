package com.example.stime.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

data class UserService(){
    //creation d'une fonction oncreate si besoin

    //création de ton rétrofit avec ton url
    val retrofit = Retrofit.Builder()
        .baseUrl("http://localhost:tonPort/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api = retrofit.create(API::class.java)

    //API est une interface qui définit les points de terminaison de l'API

    //Utilisation de l'interface API pour effectuer des requêtes à l'API locale
    val response = api.getData()
}
