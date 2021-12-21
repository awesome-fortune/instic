package za.co.fortunemaseko.instic.model.response.allCommonHealthQuestions

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AllCommonHealthQuestionsResponse(
    @SerialName("@context") val context: String,
    @SerialName("@type") val type: String,
    val about: About,
    val author: Author,
    val breadcrumb: Breadcrumb,
    val contentSubTypes: List<String>,
    val copyrightHolder: CopyrightHolder,
    val description: String,
    val genre: List<String>,
    val license: String,
    val name: String,
    val relatedLink: List<RelatedLink>,
    val significantLink: List<SignificantLink>,
    val url: String
)