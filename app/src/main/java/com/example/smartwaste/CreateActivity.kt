package com.example.smartwaste

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import java.util.Calendar
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class CreateActivity : AppCompatActivity(), OnItemSelectedListener {

    var pegawai = arrayOf("Multani", "Jake", "Logan Paul", "Rizal")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val spin = findViewById<Spinner>(R.id.Spinner_ku)
        spin.onItemSelectedListener = this

        val ad:ArrayAdapter<*> = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            pegawai
        )

        ad.setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item
        )

        spin.adapter = ad




        val timeForm = findViewById<TextView>(R.id.Create_time)

        timeForm.setOnClickListener{
            val c = Calendar.getInstance()

            val hour = c.get(Calendar.HOUR_OF_DAY)
            val minute = c.get(Calendar.MINUTE)

            val timepickerdialog = TimePickerDialog (
                this,
                {view, hourOfDay, minute ->
                    timeForm.setText("$hourOfDay:$minute")
                },
                hour,
                minute,
                false
            )

            timepickerdialog.show()

        }

        val dateForm = findViewById<TextView>(R.id.Create_date)

        dateForm.setOnClickListener{
            val c = Calendar.getInstance()

            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val datepickerdialog = DatePickerDialog(
                this,
                {view, year, monthYear, dayMonth ->
                    dateForm.text = (dayMonth.toString() + "-" + (monthYear) + "-" + year)
                },
                year,
                month,
                day
            )

            datepickerdialog.show()




        }

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(applicationContext, pegawai[position], Toast.LENGTH_LONG).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}