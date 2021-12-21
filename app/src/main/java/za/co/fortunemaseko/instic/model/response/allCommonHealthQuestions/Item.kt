package za.co.fortunemaseko.instic.model.response.allCommonHealthQuestions

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Item(
    @SerialName("@id") val id: String,
    val genre: List<String>,
    val name: String
)