package me.muhammadali.qpersonalaccounting.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import me.muhammadali.qpersonalaccounting.MainActivity
import me.muhammadali.qpersonalaccounting.R

open class BaseNavigationFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val activity = activity as MainActivity

        val toolbar = view.findViewById<Toolbar>(R.id.toolbar)
        val bottomNav = view.findViewById<BottomNavigationView>(R.id.bottomNav)

        activity.setSupportActionBar(toolbar)
        bottomNav.setupWithNavController(activity.findNavController(R.id.my_nav_host_fragment))

    }

}