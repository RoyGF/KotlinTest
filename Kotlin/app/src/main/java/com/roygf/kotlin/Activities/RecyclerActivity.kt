package com.roygf.kotlin.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.roygf.kotlin.Adapters.PetAdapter
import com.roygf.kotlin.R
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {

    val pets: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        addPets()
        recycler_pets.layoutManager = LinearLayoutManager(this)
        recycler_pets.adapter = PetAdapter(pets, this)
    }

    fun addPets() {
        pets.add("dog")
        pets.add("cat")
        pets.add("owl")
        pets.add("cheetah")
        pets.add("raccoon")
        pets.add("bird")
        pets.add("snake")
        pets.add("lizard")
        pets.add("hamster")
        pets.add("bear")
        pets.add("lion")
        pets.add("tiger")
        pets.add("horse")
        pets.add("frog")
        pets.add("fish")
        pets.add("shark")
        pets.add("turtle")
        pets.add("elephant")
        pets.add("cow")
        pets.add("beaver")
        pets.add("bison")
        pets.add("porcupine")
        pets.add("rat")
        pets.add("mouse")
        pets.add("goose")
        pets.add("deer")
        pets.add("fox")
        pets.add("moose")
        pets.add("buffalo")
        pets.add("monkey")
        pets.add("penguin")
        pets.add("parrot")
    }
}
