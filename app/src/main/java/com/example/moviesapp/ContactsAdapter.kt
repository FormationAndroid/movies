package com.example.moviesapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_contact.view.*

class ContactsAdapter(private val contacts: MutableList<Contact>) : RecyclerView.Adapter<ContactsAdapter.ContactViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ContactViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(contacts[position])
    }

    override fun getItemCount() = contacts.size

    inner class ContactViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(R.layout.item_contact, parent, false)){

        fun bind(contact: Contact){

            itemView.run {
                textName.text = contact.name
                textAge.text = contact.age.toString()
                Picasso.get().load(contact.photo).into(imgPhoto)
                layoutContact.alpha = if (contact.isValid) 1f else 0.5f

                setOnClickListener {
                    contacts.removeAt(adapterPosition)
                    notifyItemRemoved(adapterPosition)
                }
            }

        }

    }

}