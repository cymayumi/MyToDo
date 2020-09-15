package com.mayumi.mytodo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mayumi.mytodo.R

class ToDoFragment : Fragment() {

    private lateinit var viewModel: ToDoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.to_do_fragment, container, false)
    }


}