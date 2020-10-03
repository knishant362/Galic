package com.trendster.pagerfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trendster.R
import kotlinx.android.synthetic.main.fragment_pager1.*
import kotlinx.android.synthetic.main.fragment_pager2.*

class Pager2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pager2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        txtPagerTwo.text = "View Pager Name 2"

    }

}