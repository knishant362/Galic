package com.trendster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.firebase.database.FirebaseDatabase
import com.luseen.spacenavigation.SpaceItem
import com.luseen.spacenavigation.SpaceNavigationView
import com.luseen.spacenavigation.SpaceOnClickListener
import com.trendster.fragments.*

class MainActivity2 : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var spaceNavigationView : SpaceNavigationView = findViewById(R.id.space)
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState)
        spaceNavigationView.showIconOnly()

        var itemHome = SpaceItem("home", R.drawable.ic_home)
        spaceNavigationView.addSpaceItem(itemHome)

        var itemChat = SpaceItem("chat", R.drawable.ic_chat)
        spaceNavigationView.addSpaceItem(itemChat)

        var itemNotification = SpaceItem("notification", R.drawable.ic_notification)
        spaceNavigationView.addSpaceItem(itemNotification)

        var itemProfile = SpaceItem("profile", R.drawable.ic_profile)
        spaceNavigationView.addSpaceItem(itemProfile)




        spaceNavigationView.setSpaceOnClickListener(object : SpaceOnClickListener{
            override fun onCentreButtonClick() {
                setFragment(ThreeFragment())
            }

            override fun onItemReselected(itemIndex: Int, itemName: String?) {
                when(itemIndex){

                    0->{setFragment(OneFragment())}

                    1->{setFragment(TwoFragment())}

                    2->{setFragment(FourFragment())}

                    3->{setFragment(FiveFragment())}
                }
            }

            override fun onItemClick(itemIndex: Int, itemName: String?) {
                when(itemIndex){

                    0->{setFragment(OneFragment())}

                    1->{setFragment(TwoFragment())}

                    2->{setFragment(FourFragment())}

                    3->{setFragment(FiveFragment())}
                }
            }


        } )

    }
    fun setFragment(fragment: Fragment){

        supportFragmentManager.beginTransaction()
            .replace(R.id.container , fragment)
            .commit()

    }

    fun jumpToPage(view: View) {}

}



