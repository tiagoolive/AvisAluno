package livrokotlin.com.avisaluno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_instituicao.*
import kotlinx.android.synthetic.main.activity_main.*

class instituicao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instituicao)

        btn_enviar.setOnClickListener{
            val data = pik_data.toString()
            val titulo = txt_titulo.text.toString()
            val descricao = txt_descricao.text.toString()

            if(titulo.isNotEmpty() && titulo.isNotEmpty()) {
                val avis = Aviso(data, titulo, descricao)

                avisosGlobal.add(avis)
                txt_titulo.text.clear()
                txt_descricao.text.clear()
            } else {
                txt_titulo.error = if(txt_titulo.text.isEmpty()) "Preencha este campo" else null
                txt_descricao.error = if(txt_descricao.text.isEmpty()) "Preencha este campo" else null
            }
        }
    }
}
