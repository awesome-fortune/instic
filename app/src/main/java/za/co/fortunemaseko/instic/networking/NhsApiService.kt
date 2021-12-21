package za.co.fortunemaseko.instic.networking

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import za.co.fortunemaseko.instic.model.response.allCommonHealthQuestions.AllCommonHealthQuestionsResponse

interface NhsApiService {

    @GET("/common-health-questions/*")
    suspend fun getAllCommonHealthQuestions(): AllCommonHealthQuestionsResponse
}
