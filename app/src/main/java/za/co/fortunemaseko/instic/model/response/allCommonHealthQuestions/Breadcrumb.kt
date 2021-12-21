package za.co.fortunemaseko.instic.model.response.allCommonHealthQuestions

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Breadcrumb(
    @SerialName("@context") val context: String,
    @SerialName("@type") val type: String,
    val itemListElement: List<ItemElement>
)