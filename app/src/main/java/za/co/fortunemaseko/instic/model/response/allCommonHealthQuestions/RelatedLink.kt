package za.co.fortunemaseko.instic.model.response.allCommonHealthQuestions

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RelatedLink(
    @SerialName("@type") val type: String,
    val description: String,
    val linkRelationship: String,
    val name: String,
    val url: String
)