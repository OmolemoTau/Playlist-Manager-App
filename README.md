# Playlist Manager app 
*Student:* Omolemo Tau
*Student Number:* ST10470186 
*GitHub Repo:* [https://github.com/OmolemoTau/PLaylistManagerApp](https://github.com/OmolemoTau/Playlist-Manager-App.git) --- ## 
Purpose of the App This is a native Music manager and storage Android app developed in Kotlin for the IMAD5112 practicum. 
It displays the main screen whic allows users to add music to a playlist , calculates average rating, and allows users to see comments by other users.
App Design Logic I used Kotlin DSL, arrays, loops, and screen navigation to build the app. The app has 2 main screens: - *Main Screen* (data entry, average calculation) - *Detailed View Screen*

source code:
Main Activity:
package vcmsa.ci.playlistmanager

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView()

        val startButton: Button = findViewById(R.id.btnAddtolaylist)
        startButton.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }

        val exitButton: Button = findViewById(R.id.btnExit)
        exitButton.setOnClickListener {
            finishAffinity() // closes the app
        }
    }

    private fun setContentView() {

    }
}


Detailed View:
package vcmsa.ci.playlistmanager

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    @SuppressLint("MissingSuperCall")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val playlist = arrayOf(
            "Happy: Pharell Williams, 4,5",
            "She Will: Drake, 3,6",
            "Views: Drake, 3,4",
            "Soweto Groove: Kelvin Momo, 4,2",

        )

        val tvDetails = findViewById<TextView>(R.id.tvDetails)
        val builder = StringBuilder()

        for (song in playlist) {
            builder.append( song).append("\n\n")
        }

        builder.toString().also { tvDetails.text = it }
    }

    override fun setContentView(activityDetail: Int) {

    }
}

Sreenshots:
<img width="1375" alt="Screenshot 2025-06-19 at 10 51 27" src="https://github.com/user-attachments/assets/2d4697d2-d256-45bb-ba1f-25422ebedbc5" />  source code
<img width="1440" alt="Screenshot 2025-01-21 at 09 59 28" src="https://github.com/user-attachments/assets/6b8f427b-c5ea-407e-9482-fbb6c3cee459" />  source code
<img width="932" alt="Screenshot 2025-06-19 at 10 29 43" src="https://github.com/user-attachments/assets/d3cdb3b7-f82a-4ae9-9639-eebef79b926c" />   Detailed View screen
<img width="1375" alt="Screenshot 2025-06-19 at 10 34 05" src="https://github.com/user-attachments/assets/dda664eb-c848-4b57-a427-7446f14375d6" />
<img width="1375" alt="Screenshot 2025-06-19 at 10 51 27" src="https://github.com/user-attachments/assets/3bd192f0-965e-41ee-af4c-7147a56fbd8e" />




