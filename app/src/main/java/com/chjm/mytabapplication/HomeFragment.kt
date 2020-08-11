package com.chjm.mytabapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private val mNicolasCageMovies = listOf(
        home("Raising Arizona", "1987"),
        home("Vampire's Kiss", "1988"),
        home("Con Air", "1997"),
        home("Gone in 60 Seconds", "1997"),
        home("National Treasure", "2004"),
        home("The Wicker Man", "2006"),
        home("Ghost Rider", "2007"),
        home("Knowing", "2009"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012"),
        home("asdfadfsfdsa", "21012")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        retainInstance = true

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        myRecyclerView.apply {

            layoutManager = LinearLayoutManager(activity)
            adapter = ListAdapter(mNicolasCageMovies)
        }
    }

    companion object {
        fun newInstance(): HomeFragment = HomeFragment()
    }
}


