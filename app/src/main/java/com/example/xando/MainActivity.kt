package com.example.xando

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.ArrayList

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var resetbutton: Button
    private lateinit var playeronescore: TextView
    private lateinit var playertwoscore: TextView

    private var activeplayer = 1

    private var scoreone = 0

    private var scoretwo = 0

    private var firstplayer = ArrayList<Int>()
    private var secondplayer = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playeronescore = findViewById(R.id.playeronescore)
        playertwoscore = findViewById(R.id.playertwoscore)
        resetbutton = findViewById(R.id.resetbutton)

        init()

    }

    private fun init() {

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)

    }

    override fun onClick(clickedview: View?) {

        if (clickedview is Button) {

            var buttonnumber = 0

            when(clickedview.id) {

                R.id.button1 -> buttonnumber = 1
                R.id.button2 -> buttonnumber = 2
                R.id.button3 -> buttonnumber = 3
                R.id.button4 -> buttonnumber = 4
                R.id.button5 -> buttonnumber = 5
                R.id.button6 -> buttonnumber = 6
                R.id.button7 -> buttonnumber = 7
                R.id.button8 -> buttonnumber = 8
                R.id.button9 -> buttonnumber = 9

            }

            if (buttonnumber !=0)
                playgame(clickedview, buttonnumber)

        }

    }

    private fun playgame(clickedview: Button, buttonnumber: Int) {

        if (activeplayer == 1) {

            activeplayer = 2
            clickedview.text = "✕"
            clickedview.setBackgroundColor(Color.DKGRAY)
            firstplayer.add(buttonnumber)

        } else {

            activeplayer = 1
            clickedview.text = "⬤"
            clickedview.setBackgroundColor(Color.DKGRAY)
            secondplayer.add(buttonnumber)
            
        }

        resetbutton.setOnClickListener() {

            button1.isClickable = true
            button1.text = ""
            button1.setBackgroundColor(Color.parseColor("#C1C1C1"))
            firstplayer.remove(1)
            secondplayer.remove(1)

            button2.isClickable = true
            button2.text = ""
            button2.setBackgroundColor(Color.parseColor("#C1C1C1"))
            firstplayer.remove(2)
            secondplayer.remove(2)

            button3.isClickable = true
            button3.text = ""
            button3.setBackgroundColor(Color.parseColor("#C1C1C1"))
            firstplayer.remove(3)
            secondplayer.remove(3)

            button4.isClickable = true
            button4.text = ""
            button4.setBackgroundColor(Color.parseColor("#C1C1C1"))
            firstplayer.remove(4)
            secondplayer.remove(4)

            button5.isClickable = true
            button5.text = ""
            button5.setBackgroundColor(Color.parseColor("#C1C1C1"))
            firstplayer.remove(5)
            secondplayer.remove(5)

            button6.isClickable = true
            button6.text = ""
            button6.setBackgroundColor(Color.parseColor("#C1C1C1"))
            firstplayer.remove(6)
            secondplayer.remove(6)

            button7.isClickable = true
            button7.text = ""
            button7.setBackgroundColor(Color.parseColor("#C1C1C1"))
            firstplayer.remove(7)
            secondplayer.remove(7)

            button8.isClickable = true
            button8.text = ""
            button8.setBackgroundColor(Color.parseColor("#C1C1C1"))
            firstplayer.remove(8)
            secondplayer.remove(8)

            button9.isClickable = true
            button9.text = ""
            button9.setBackgroundColor(Color.parseColor("#C1C1C1"))
            firstplayer.remove(9)
            secondplayer.remove(9)

            activeplayer = 1

        }

        clickedview.isClickable = false

        check()

    }

    private fun check() {

        var winnerplayer = 0



        if (firstplayer.contains(1) && firstplayer.contains(2) && firstplayer.contains(3)) {

            winnerplayer = 1

        }

        if (secondplayer.contains(1) && secondplayer.contains(2) && secondplayer.contains(3)) {

            winnerplayer = 2

        }

        if (firstplayer.contains(4) && firstplayer.contains(5) && firstplayer.contains(6)) {

            winnerplayer = 1

        }

        if (secondplayer.contains(4) && secondplayer.contains(5) && secondplayer.contains(6)) {

            winnerplayer = 2

        }

        if (firstplayer.contains(7) && firstplayer.contains(8) && firstplayer.contains(9)) {

            winnerplayer = 1

        }

        if (secondplayer.contains(7) && secondplayer.contains(8) && secondplayer.contains(9)) {

            winnerplayer = 2

        }

        if (firstplayer.contains(1) && firstplayer.contains(4) && firstplayer.contains(7)) {

            winnerplayer = 1

        }

        if (secondplayer.contains(1) && secondplayer.contains(4) && secondplayer.contains(7)) {

            winnerplayer = 2

        }

        if (firstplayer.contains(2) && firstplayer.contains(5) && firstplayer.contains(8)) {

            winnerplayer = 1

        }

        if (secondplayer.contains(2) && secondplayer.contains(5) && secondplayer.contains(8)) {

            winnerplayer = 2

        }

        if (firstplayer.contains(3) && firstplayer.contains(6) && firstplayer.contains(9)) {

            winnerplayer = 1

        }

        if (secondplayer.contains(3) && secondplayer.contains(6) && secondplayer.contains(9)) {

            winnerplayer = 2

        }

        if (firstplayer.contains(1) && firstplayer.contains(5) && firstplayer.contains(9)) {

            winnerplayer = 1

        }

        if (secondplayer.contains(1) && secondplayer.contains(5) && secondplayer.contains(9)) {

            winnerplayer = 2

        }

        if (firstplayer.contains(3) && firstplayer.contains(5) && firstplayer.contains(7)) {

            winnerplayer = 1

        }

        if (secondplayer.contains(3) && secondplayer.contains(5) && secondplayer.contains(7)) {

            winnerplayer = 2

        }

        if (firstplayer.contains(1) or secondplayer.contains(1)
            && firstplayer.contains(2) or secondplayer.contains(2)
            && firstplayer.contains(3) or secondplayer.contains(3)
            && firstplayer.contains(4) or secondplayer.contains(4)
            && firstplayer.contains(5) or secondplayer.contains(5)
            && firstplayer.contains(6) or secondplayer.contains(6)
            && firstplayer.contains(7) or secondplayer.contains(7)
            && firstplayer.contains(8) or secondplayer.contains(8)
            && firstplayer.contains(9) or secondplayer.contains(9)
            && winnerplayer != 1 && winnerplayer !=2) {

            winnerplayer = 3

        }
        if (winnerplayer == 1) {

            button1.isClickable = false
            button2.isClickable = false
            button3.isClickable = false
            button4.isClickable = false
            button5.isClickable = false
            button6.isClickable = false
            button7.isClickable = false
            button8.isClickable = false
            button9.isClickable = false

            scoreone += 1

            playeronescore.text = "$scoreone"

            Toast.makeText(this, "The winner is player one!", Toast.LENGTH_SHORT).show()

        } else if (winnerplayer == 2) {

            button1.isClickable = false
            button2.isClickable = false
            button3.isClickable = false
            button4.isClickable = false
            button5.isClickable = false
            button6.isClickable = false
            button7.isClickable = false
            button8.isClickable = false
            button9.isClickable = false

            scoretwo += 1

            playertwoscore.text = "$scoretwo"

            Toast.makeText(this, "the winner is player two!", Toast.LENGTH_SHORT).show()

        } else if (winnerplayer == 3){

            Toast.makeText(this, "draw", Toast.LENGTH_SHORT).show()

        }




    }

    }

