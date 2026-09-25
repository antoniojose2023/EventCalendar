package br.com.devmobile.eventcalendar.model

import android.os.Parcelable
import java.io.Serializable

data class Evento(
    val nome: String,
    val data: String,
    val hora: String,
    val local: String,
    val descricao: String,
    val organizador: String,
): Serializable