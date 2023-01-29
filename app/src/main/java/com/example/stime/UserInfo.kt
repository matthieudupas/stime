package com.example.stime

data class UserInfo(
    @SerializedName("user_email") val userEmail: String?,
    @SerializedName("user_password") val userPassword: String?
)
