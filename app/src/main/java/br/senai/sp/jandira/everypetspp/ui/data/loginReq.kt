package br.senai.sp.jandira.everypetspp.ui.data

import com.google.gson.annotations.SerializedName

data class loginReq(
        @SerializedName("email")
        var email: String,

        @SerializedName("password")
        var password: String
)
