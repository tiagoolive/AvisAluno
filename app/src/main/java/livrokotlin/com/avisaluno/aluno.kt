package livrokotlin.com.avisaluno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class aluno : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aluno)

        val avisoAdapter = avisoAdapter(this)

        avisoAdapter.addAll(avisosGlobal)
    }
}
