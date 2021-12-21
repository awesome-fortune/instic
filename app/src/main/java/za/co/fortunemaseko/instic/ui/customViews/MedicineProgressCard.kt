package za.co.fortunemaseko.instic.ui.customViews

import android.content.Context
import android.util.AttributeSet
import androidx.cardview.widget.CardView
import za.co.fortunemaseko.instic.R

class MedicineProgressCard(
    context: Context,
    attrs: AttributeSet
) : CardView(context, attrs) {
    init {
        inflate(getContext(), R.layout.medicine_progress_card, this)
    }
}