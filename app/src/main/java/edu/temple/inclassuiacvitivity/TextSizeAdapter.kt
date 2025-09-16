package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.w3c.dom.Text

class TextSizeAdapter (private val c: Context, private val items: Array<Int>): BaseAdapter() {

    override fun getCount() = items.size


    override fun getItem(position: Int) = items[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        return if (convertView == null) {
            TextView(c)
        } else {
            convertView as TextView
        }.apply {
            text = items[position].toString()
            textSize = 22f
        }

//       val textView: TextView
//
//       if (convertView == null) {
//           textView = TextView(c)
//       } else {
//           textView = convertView as TextView
//       }
//
//        textView.text = items[position].toString()
//        textView.textSize = 22f
//
//        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        return (getView(position,convertView,parent) as TextView).apply {
            textSize = items[position].toFloat()
        }
    }

}