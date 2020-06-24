package livrokotlin.com.avisaluno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_aluno.setOnClickListener{
            val intentAluno = Intent(this, aluno::class.java)

            startActivity(intentAluno)
        }
        btn_instituicao.setOnClickListener{
            val intentInstituicao = Intent(this, instituicao::class.java)

            startActivity(intentInstituicao)
        }
    }
}
