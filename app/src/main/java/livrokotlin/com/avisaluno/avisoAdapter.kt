package livrokotlin.com.avisaluno

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView



class avisoAdapter(contexto: Context) : ArrayAdapter<Aviso>(contexto, 0){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val v:View

        if(convertView != null){
            v = convertView
        } else{
            v = LayoutInflater.from(context).inflate(R.layout.list_view_aviso, parent, false)
        }
        val item = getItem(position)

        val txt_data = v.findViewById<TextView>(R.id.txt_aviso_data)
        val txt_titulo = v.findViewById<TextView>(R.id.txt_aviso_titulo)
        val txt_descricao = v.findViewById<TextView>(R.id.txt_aviso_descricao)

      //  txt_data = item.data.toString()
      //  txt_titulo = item.titulo.toString()
      //   txt_descricao = item.titulo.toString()

        return v
    }
}