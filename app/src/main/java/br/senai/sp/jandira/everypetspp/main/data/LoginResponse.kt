package br.senai.sp.jandira.everypetspp.main.data

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("Id")
    var Id: Int,

    @SerializedName("name")
    var name: String,

    @SerializedName("surname")
    var email: String,

    @SerializedName("cpf")
    var cpf: String,

    @SerializedName("birth_date")
    var birth_date: String,

    @SerializedName("email")
    var telephone: String,

    @SerializedName("token")
    var password: String,

    @SerializedName("token")
    var name_adress: String,
)
