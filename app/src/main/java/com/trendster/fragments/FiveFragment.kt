package com.trendster.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.card.MaterialCardView
import com.trendster.R
import com.trendster.pagerfragments.Pager1
import com.trendster.pagerfragments.Pager2
import com.trendster.pagerfragments.Pager3


class FiveFragment : Fragment() {


    private lateinit var card1 : MaterialCardView
    lateinit var card2 : MaterialCardView
    lateinit var card3 : MaterialCardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_five, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

//        val getSupportFragmentManager = fragmentManager
//        val adapter = getSupportFragmentManager?.let { MyViewPagerAdapter(it) }
//
//        if (adapter != null) {
//            adapter.addFragment(Pager1() , "One")
//        }
//        if (adapter != null) {
//            adapter.addFragment(Pager2() , "Two")
//        }
//        if (adapter != null) {
//            adapter.addFragment(Pager3() , "Three")
//        }

        val viewPager: ViewPager = view.findViewById(R.id.ViewPager)
//        val tabLayout: TabLayout = view.findViewById(R.id.TabLayout)

        // attach tablayout with viewpager

        // attach tablayout with viewpager
//        tabLayout.setupWithViewPager(viewPager)

        val adapter = MyViewPagerAdapter(childFragmentManager)

        // add your fragments

        // add your fragments
        adapter.addFragment(Pager1(), "Tab1")
        adapter.addFragment(Pager2(), "Tab2")
        adapter.addFragment(Pager3(), "Tab3")

        // set adapter on viewpager

        // set adapter on viewpager
        viewPager.adapter = adapter

        fun jumpToPage(view: View?) {
            viewPager.currentItem = 1
        }

        card1 = view.findViewById(R.id.cardTwo)
        card2 = view.findViewById(R.id.cardTwo)
        card3 = view.findViewById(R.id.cardThree)

        //Click listener to Open viewPager by Cardview[

        card1.setOnClickListener{
            Toast.makeText(context, "Card Click 1" , Toast.LENGTH_SHORT).show()
            viewPager.currentItem = 0
        }
        card2.setOnClickListener{
            Toast.makeText(context, "Card Click 2" , Toast.LENGTH_SHORT).show()
            viewPager.currentItem = 1
        }
        card3.setOnClickListener{
            Toast.makeText(context, "Card Click 3" , Toast.LENGTH_SHORT).show()
            viewPager.currentItem = 2
        }


    }
    class MyViewPagerAdapter(manager : FragmentManager) : FragmentPagerAdapter(manager) {

        private var fragmentList : MutableList<Fragment> = ArrayList()
        private var titleList : MutableList<String> = ArrayList()

        override fun getItem(position: Int): Fragment {

            return fragmentList[position]
        }

        override fun getCount(): Int {
            return fragmentList.size
        }

        fun addFragment(fragment: Fragment , title: String){
            fragmentList.add(fragment)
            titleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return titleList[position]
        }
    }


}