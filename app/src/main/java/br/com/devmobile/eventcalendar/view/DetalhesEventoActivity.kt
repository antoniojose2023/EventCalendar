package br.com.devmobile.eventcalendar.view

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import br.com.devmobile.eventcalendar.R
import br.com.devmobile.eventcalendar.databinding.ActivityDetalhesEventoBinding
import br.com.devmobile.eventcalendar.databinding.ActivityEventosBinding
import br.com.devmobile.eventcalendar.model.Evento

class DetalhesEventoActivity : AppCompatActivity() {
    private val binding by lazy { ActivityDetalhesEventoBinding.inflate(layoutInflater) }

    private lateinit var evento: Evento

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
       /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }*/


        val bunble = intent.extras
        if(bunble != null){

            evento = (if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
                bunble.getSerializable("evento", Evento::class.java)
            }else{
                bunble.getSerializable("evento")
            }) as Evento


            populaTelaDetalhes(evento)
        }

        binding.imageButtonVoltar.setOnClickListener {
               finish()
        }

    }

    fun populaTelaDetalhes(evento: Evento){

          binding.apply {

              tvTituloDetalhes.text = evento.nome
              tvDataDetalhes.text = "Data : ${evento.data}"
              tvHoraDetalhes.text = "Horário : ${evento.hora}"
              tvLocalDetalhe.text = "Local : ${evento.local}"
              tvDescricaoDetalhe.text = evento.descricao
              tvOrganizadorDetalhe.text = evento.organizador

          }

    }

}