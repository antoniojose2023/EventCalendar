package br.com.devmobile.eventcalendar.view

import android.content.Intent
import android.os.Bundle
import android.widget.SearchView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.devmobile.eventcalendar.AdapterEventos
import br.com.devmobile.eventcalendar.R
import br.com.devmobile.eventcalendar.databinding.ActivityEventosBinding
import br.com.devmobile.eventcalendar.datasource.DataSource
import br.com.devmobile.eventcalendar.model.Evento

class EventosActivity : AppCompatActivity() {
    private val binding by lazy { ActivityEventosBinding.inflate(layoutInflater) }
    private val adapterEventos by lazy { AdapterEventos() }
    var eventos = DataSource.getEventos()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        adapterEventos.onClick = { evento ->
               val intent = Intent(this, DetalhesEventoActivity::class.java)
               intent.putExtra("evento", evento)
               startActivity( intent )
        }

        binding.searchViewEventos.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextChange(p0: String?): Boolean {
                 filtroLista( p0!! )
                 return true
            }

            override fun onQueryTextSubmit(p0: String?): Boolean {
                return true
            }

        })



    }

    override fun onStart() {
        super.onStart()
        configurarRecyclerView(eventos as MutableList<Evento>)
    }


    fun configurarRecyclerView(eventos: MutableList<Evento>){
             adapterEventos.addEventos(eventos)
             binding.rvEventos.adapter = adapterEventos
             binding.rvEventos.layoutManager= LinearLayoutManager(this, RecyclerView.VERTICAL, false)
             binding.rvEventos.setHasFixedSize(true)
    }


    fun filtroLista(nomeEvento: String){
          val listaFiltrada = if(nomeEvento.isNullOrEmpty()){
                eventos
          }else{
                eventos.filter { it.nome.startsWith(nomeEvento) }
          }

          adapterEventos.addEventos(listaFiltrada as MutableList<Evento>)
    }

}