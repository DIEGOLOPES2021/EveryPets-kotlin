package br.senai.sp.jandira.everypetspp.ui.api

import br.senai.sp.jandira.everypetspp.ui.data.User
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.POST

class retrofitFactoryUser {

    class userEndPoin{
        val url = "https://everypets-backend.herokuapp.com/"
        val service = Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build()

        fun login():Login{
            return  service.create(Login::class.java)
        }
    }

    interface Login {
        @POST("/user")
        fun login(): User
    }

}
