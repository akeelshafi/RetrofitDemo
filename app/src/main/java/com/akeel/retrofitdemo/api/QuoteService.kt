package com.akeel.retrofitdemo.api

import com.akeel.retrofitdemo.models.QuoteList
import retrofit2.Response
import retrofit2.http.GET

interface QuoteService {

    @GET
    suspend fun getQuotes(): Response<QuoteList>

}