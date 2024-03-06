package com.example.lab4ex2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeBtn: Button = findViewById(R.id.home)
        val nextBtn: Button = findViewById(R.id.next)
        val backBtn: Button = findViewById(R.id.previews)
        val chaptBtn: Button = findViewById(R.id.chapSelect)

        val intentHome = Intent(this, PageHome::class.java)

        chaptBtn.setOnClickListener(){
            showChapterSelectionDialog()
        }

        backBtn.setOnClickListener(){
            val currentFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)

            when (currentFragment) {
                is ThirdChapter -> switchFragment(SecondChapter())
                is SecondChapter -> switchFragment(firstpageDracula())
            }
        }

        nextBtn.setOnClickListener() {
            val currentFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)

            when (currentFragment) {
                is firstpageDracula -> switchFragment(SecondChapter())
                is SecondChapter -> switchFragment(ThirdChapter())
            }
        }

        if (savedInstanceState == null) {
            switchFragment(firstpageDracula())
        }

        homeBtn.setOnClickListener(){
            startActivity(intentHome)
        }

    }
    private fun switchFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun showChapterSelectionDialog() {
        val dialogView = layoutInflater.inflate(R.layout.dialog_chapter_selection, null)

        val alertDialogBuilder = AlertDialog.Builder(this)
            .setView(dialogView)

        val alertDialog = alertDialogBuilder.create()
        val btnChapter1 = dialogView.findViewById<Button>(R.id.btnChapter1)
        val btnChapter2 = dialogView.findViewById<Button>(R.id.btnChapter2)
        val btnChapter3 = dialogView.findViewById<Button>(R.id.btnChapter3)

        btnChapter1.setOnClickListener {
            switchFragment(firstpageDracula())
            alertDialog.dismiss()
        }

        btnChapter2.setOnClickListener {
            switchFragment(SecondChapter())
            alertDialog.dismiss()
        }

        btnChapter3.setOnClickListener {
            switchFragment(ThirdChapter())
            alertDialog.dismiss()
        }

        alertDialog.show()
    }
}