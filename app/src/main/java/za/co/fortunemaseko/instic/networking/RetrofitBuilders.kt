package za.co.fortunemaseko.instic.networking

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import za.co.fortunemaseko.instic.util.InsticConstants

fun buildClient(): OkHttpClient = OkHttpClient.Builder()
    .addInterceptor(HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    })
    .addInterceptor(buildAuthorizationInterceptor())
    .build()

@ExperimentalSerializationApi
fun buildRetrofit(baseUrl: String): Retrofit {
    val contentType = "application/json".toMediaType()

    return Retrofit.Builder()
        .client(buildClient())
        .baseUrl(baseUrl)
        .addConverterFactory(Json.asConverterFactory(contentType))
        .build()
}

@ExperimentalSerializationApi
fun buildNhsApiService(): NhsApiService = buildRetrofit(InsticConstants.NHS_API_BASE_URL)
    .create(NhsApiService::class.java)

fun buildAuthorizationInterceptor() = Interceptor { chain ->


    val req = chain.request().newBuilder()
        .addHeader(
            InsticConstants.NHS_API_SUBSCRIPTION_KEY_HEADER,
            InsticConstants.NHS_API_SUBSCRIPTION_KEY
        )
        .build()

    chain.proceed(req)
}