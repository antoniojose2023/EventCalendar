package br.com.devmobile.eventcalendar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.devmobile.eventcalendar.databinding.ItemEventoBinding
import br.com.devmobile.eventcalendar.model.Evento

class AdapterEventos(var onClick: (Evento) -> Unit = {}): RecyclerView.Adapter<AdapterEventos.ViewHoldeEventos>()  {

    var eventos = mutableListOf<Evento>()

    fun addEventos(listaEventos: MutableList<Evento>){
         eventos = listaEventos
         notifyDataSetChanged()
    }

    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int): ViewHoldeEventos {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemEventoBinding.inflate(layoutInflater, parent, false)
        return ViewHoldeEventos(binding)
    }

    override fun onBindViewHolder( holder: ViewHoldeEventos, position: Int) {

          val evento = eventos[position]
          holder.bind( evento )

    }

    override fun getItemCount() = eventos.size

    inner class ViewHoldeEventos(val binding: ItemEventoBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(evento: Evento){

               binding.apply {

                     tvTitulo.text = evento.nome
                     tvDataHora.text = "${evento.data} * ${evento.hora}"
                     tvLocal.text = evento.local
               }

               binding.itemCardEvento.setOnClickListener {
                     onClick( evento )
               }

        }
    }

}