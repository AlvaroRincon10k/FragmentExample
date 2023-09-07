package com.example.fragmentexample

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_red.*

class RedFragment : Fragment() {

    private var listener: OnFragmentActionsListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_red, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btnPlus.setOnClickListener{ listener?.onClickFragmentButton()}
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is OnFragmentActionsListener){
            listener = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}