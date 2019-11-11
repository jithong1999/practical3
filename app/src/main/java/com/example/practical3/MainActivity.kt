package com.example.practical3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerage.setOnItemClickListener(this)
        buttoncalculate.setOnClickListener {
            calculatePremium()
        }
    }

    private fun calculatePremium() {
        val position=spinnerage.selectedItemPosition
        var premium:Int
        val gender=radiogender.checkedRadioButtonId

        if(position==0){
            premium=60
        }

        if(gender==R.id.radioButtonmale){

        }

        if(checkBoxsmoke.isChecked){

        }



    }
}
