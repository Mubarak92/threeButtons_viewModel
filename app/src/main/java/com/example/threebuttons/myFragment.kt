package com.example.threebuttons

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.threebuttons.databinding.FragmentMyBinding


class myFragment : Fragment() {

    private val viewModel: myViewModel by viewModels()
    private lateinit var binding: FragmentMyBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMyBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.add1.setOnClickListener {
            viewModel.add1()
            binding.textView.text = viewModel.score.toString()
        }
        binding.sub2.setOnClickListener {
            viewModel.sub2()
            binding.textView.text = viewModel.score.toString()
        }
        binding.add4.setOnClickListener {
            viewModel.add4()
            binding.textView.text = viewModel.score.toString()


        }

    }
}