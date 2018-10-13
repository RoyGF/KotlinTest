package com.roygf.kotlin.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.roygf.kotlin.R
import kotlinx.android.synthetic.main.item_pet.view.*

class PetAdapter (val items : ArrayList<String>, val context: Context)
    : RecyclerView.Adapter<PetAdapter.ViewHolder>() {


    class ViewHolder (view : View) : RecyclerView.ViewHolder(view){
        val petItem = view.text_pet
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_pet, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.petItem?.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }

}