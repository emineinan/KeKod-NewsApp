package com.example.kekod_newsapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.kekod_newsapp.R
import com.example.kekod_newsapp.databinding.FragmentDetailBinding
import com.example.kekod_newsapp.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var dataBinding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)
        return dataBinding.root
    }
}