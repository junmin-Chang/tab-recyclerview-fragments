package com.chjm.mytabapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setUp()

    }

    private fun setUp() {
        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(HomeFragment(), "home")
        adapter.addFragment(ProfileFragment(), "profile")
        adapter.addFragment(SearchFragment(), "search")

        tabs.getTabAt(0)
        tabs.getTabAt(1)
        tabs.getTabAt(2)

        viewPager.adapter = adapter

        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)?.setIcon(R.drawable.ic_baseline_home_24)
        tabs.getTabAt(1)?.setIcon(R.drawable.ic_baseline_person_24)
        tabs.getTabAt(2)?.setIcon(R.drawable.ic_baseline_search_24)


    }
}