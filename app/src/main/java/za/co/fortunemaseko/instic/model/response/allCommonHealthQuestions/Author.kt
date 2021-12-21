package za.co.fortunemaseko.instic.model.response.allCommonHealthQuestions

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Author(
    @SerialName("@type") val type: String,
    val email: String,
    val logo: String,
    val name: String,
    val url: String
)