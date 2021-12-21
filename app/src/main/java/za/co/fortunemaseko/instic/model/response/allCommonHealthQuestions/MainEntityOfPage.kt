package za.co.fortunemaseko.instic.model.response.allCommonHealthQuestions

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MainEntityOfPage(
    @SerialName("@type") val type: String,
    val dateModified: String,
    val datePublished: String
)