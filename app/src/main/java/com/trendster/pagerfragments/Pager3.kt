package com.trendster.pagerfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.trendster.R
import kotlinx.android.synthetic.main.fragment_pager1.*
import kotlinx.android.synthetic.main.fragment_pager3.*

class Pager3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pager3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        txtPagerThree.text = "View Pager Name 3"

    }
}