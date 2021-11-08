package br.senai.sp.jandira.everypetspp.main

import br.senai.sp.jandira.everypetspp.main.data.LoginRequest
import br.senai.sp.jandira.everypetspp.main.data.LoginResponse
import br.senai.sp.jandira.everypetspp.main.utils.Constants
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
        @POST(Constants.LOGIN_URL)
        fun login(@Body loginRequest: LoginRequest): Call<LoginResponse>
}