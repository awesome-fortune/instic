package za.co.fortunemaseko.instic.ui.fragments.medicalReminders

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import za.co.fortunemaseko.instic.R

class MedicalRemindersFragment : Fragment() {

    companion object {
        fun newInstance() = MedicalRemindersFragment()
    }

    private lateinit var viewModel: MedicalRemindersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.medical_reminders_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MedicalRemindersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}