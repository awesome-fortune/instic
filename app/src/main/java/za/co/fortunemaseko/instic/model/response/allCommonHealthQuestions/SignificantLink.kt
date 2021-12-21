package za.co.fortunemaseko.instic.model.response.allCommonHealthQuestions

import kotlinx.serialization.SerialInfo
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class SignificantLink(
    @SerialName("@type") val type: String,
    val description: String,
    val genre: List<String>,
    val linkRelationship: String,
    val mainEntityOfPage: MainEntityOfPage,
    val name: String,
    val url: String
)