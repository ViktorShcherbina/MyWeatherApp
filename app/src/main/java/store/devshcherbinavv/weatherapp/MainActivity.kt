package store.devshcherbinavv.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject
import store.devshcherbinavv.weatherapp.databinding.ActivityMainBinding
import store.devshcherbinavv.weatherapp.fragments.MainFragment

const val API_KEY = "3471ef172e6d423cb4a102148232603"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            supportFragmentManager
                .beginTransaction().replace(R.id.placeHolder, MainFragment.newInstance()).commit()

        }
    }

