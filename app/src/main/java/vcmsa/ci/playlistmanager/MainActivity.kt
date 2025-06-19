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