package com.timac.viewbinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.timac.viewbinding.databinding.FragmentExampleBinding

class ExampleFragment : Fragment(R.layout.fragment_example) {

    private var _binding: FragmentExampleBinding? = null
    private val binding get() = _binding!!                  // Specifies the non-null binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExampleBinding.inflate(inflater,container, false)

        binding.fragmentTextView1.text = "View Binding"
        binding.fragmentTextView2?.text = "works in fragments"

        //For the include layout

        binding.includeLayout.includeTextView1.text = "and with"
        binding.includeLayout.includeTextView2.text = "Include layouts"

        return binding.root
    }

    override fun onDestroyView() {                  // Remember to assign null in onDestroy to avoid memory leaks
        super.onDestroyView()
        _binding = null
    }
}

// Binding in Fragment