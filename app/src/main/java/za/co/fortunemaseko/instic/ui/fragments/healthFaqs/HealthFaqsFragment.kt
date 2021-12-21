package za.co.fortunemaseko.instic.ui.fragments.healthFaqs

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import za.co.fortunemaseko.instic.R

class HealthFaqsFragment : Fragment() {

    companion object {
        fun newInstance() = HealthFaqsFragment()
    }

    private lateinit var viewModel: HealthFaqsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.health_faqs_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HealthFaqsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}