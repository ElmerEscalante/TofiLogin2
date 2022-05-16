package escalante.elmer.tofologin.ui.actividades

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import escalante.elmer.tofologin.databinding.FragmentActividadesBinding
import escalante.elmer.tofologin.databinding.FragmentNotificationsBinding

class ActividadesFragment : Fragment() {

    private var _binding: FragmentActividadesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val actividadesViewModel =
            ViewModelProvider(this).get(ActividadesViewModel::class.java)

        _binding = FragmentActividadesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textActividades

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}