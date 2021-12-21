package za.co.fortunemaseko.instic.model.response.allCommonHealthQuestions

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ItemElement(
    @SerialName("@type") val type: String,
    val item: Item,
    val position: Int
)