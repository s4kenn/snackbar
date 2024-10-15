package com.aditya.snackbar

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.behavior.SwipeDismissBehavior
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val cse=findViewById<ImageButton>(R.id.imageButton1)
        val bba=findViewById<ImageButton>(R.id.imageButton2)
        val mbbs=findViewById<ImageButton>(R.id.imageButton3)
        val bcom=findViewById<ImageButton>(R.id.imageButton4)
        val mba=findViewById<ImageButton>(R.id.imageButton5)
        val pharm=findViewById<ImageButton>(R.id.imageButton6)
        val phe =findViewById<ImageButton>(R.id.imageButton7)
        val journalism =findViewById<ImageButton>(R.id.imageButton8)
        val agri =findViewById<ImageButton>(R.id.imageButton9)
        val coordinatorLayout = findViewById<CoordinatorLayout>(R.id.coordinatorLayout)
        cse.setOnClickListener { view ->
            val snackbar = Snackbar.make(view, "Welcome to School of CSE", Snackbar.LENGTH_LONG)
            snackbar.setAction("Upload Assignment") {
                val intent = Intent(this, CSE::class.java)
                startActivity(intent)
            }.show()
            // Enabling swipe behavior for Snackbar
            val behavior = SwipeDismissBehavior<View>()
            val snackbarView = snackbar.view
            val layoutParams = snackbarView.layoutParams as CoordinatorLayout.LayoutParams
            layoutParams.behavior = behavior
            snackbarView.layoutParams = layoutParams
        }
        bba.setOnClickListener { view->
            Snackbar.make(view,"Welcome to Mittal School of Business",Snackbar.LENGTH_LONG).setAction("Upload Assignment"){
                val intent = Intent(this, Bba::class.java)
                startActivity(intent)
            }.show()
        }
        mbbs.setOnClickListener { view->
            Snackbar.make(view,"Welcome to School of MBBS",Snackbar.LENGTH_LONG).setAction("Upload Assignment"){
                Toast.makeText(this,"Undo was clicked",Toast.LENGTH_LONG).show()
            }.show()
        }
        bcom.setOnClickListener { view->
            Snackbar.make(view,"Welcome to School of Commerce",Snackbar.LENGTH_LONG).setAction("Upload Assignment"){
                Toast.makeText(this,"Undo was clicked",Toast.LENGTH_LONG).show()
            }.show()
        }
        mba.setOnClickListener { view->
            Snackbar.make(view,"Welcome to Mittal School of Business",Snackbar.LENGTH_LONG).setAction("Upload Assignment"){
                Toast.makeText(this,"Undo was clicked",Toast.LENGTH_LONG).show()
            }.show()
        }
        pharm.setOnClickListener { view->
            Snackbar.make(view,"Welcome to School of Pharmacy",Snackbar.LENGTH_LONG).setAction("Upload Assignment"){
                Toast.makeText(this,"Undo was clicked",Toast.LENGTH_LONG).show()
            }.show()
        }
        phe.setOnClickListener { view->
            Snackbar.make(view,"Welcome to School of Physical Education",Snackbar.LENGTH_LONG).setAction("Upload Assignment"){
                Toast.makeText(this,"Undo was clicked",Toast.LENGTH_LONG).show()
            }.show()
        }
        journalism.setOnClickListener { view->
            Snackbar.make(view,"Welcome to School of Journalism",Snackbar.LENGTH_LONG).setAction("Upload Assignment"){
                Toast.makeText(this,"Undo was clicked",Toast.LENGTH_LONG).show()
            }.show()
        }
        agri.setOnClickListener { view->
            Snackbar.make(view,"Welcome to School of Agriculture",Snackbar.LENGTH_LONG).setAction("Upload Assignment"){
                val intent = Intent(this, Agri::class.java)
                startActivity(intent)
            }.show()
        }
    }
}