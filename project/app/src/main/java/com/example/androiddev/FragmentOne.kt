package com.example.androiddev
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.androiddev.databinding.FragmentOneBinding


class FragmentOne:Fragment(){
    private var _binding: FragmentOneBinding? = null
    private val binding
        get() = _binding!!
    companion object{
        fun newInstance() = FragmentOne()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        binding.button.setOnClickListener{
//            val fragment = FragmentSecond.newInstance()
//            parentFragmentManager
//                .beginTransaction()
//                .addToBackStack(null)
//                .replace(R.id.fragment_container_view, fragment)
//                .commit()
//        }
    }

}