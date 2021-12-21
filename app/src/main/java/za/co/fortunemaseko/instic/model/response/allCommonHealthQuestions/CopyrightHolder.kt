package za.co.fortunemaseko.instic.model.response.allCommonHealthQuestions

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CopyrightHolder(
    @SerialName("@type") val type: String,
    val name: String
)