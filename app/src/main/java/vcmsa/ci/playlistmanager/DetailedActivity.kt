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
            "Monday: Sunny, 24°C",
            "Tuesday: Cloudy, 22°C",
            "Wednesday: Rainy, 18°C",
            "Thursday: Sunny, 25°C",
            "Friday: Windy, 20°C",
            "Saturday: Stormy, 17°C",
            "Sunday: Clear, 23°C"
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