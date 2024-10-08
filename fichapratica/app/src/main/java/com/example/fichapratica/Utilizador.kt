package com.example.fichapratica

import java.io.Serializable

//import kotlinx.serialization.*
//import kotlinx.serialization.json.*

class Utilizador(val nome: String, val pass: String, val telefone: String, val morada: String) :
    Serializable {
    override fun toString(): String {
        return "$nome  $telefone $morada $pass"
    }
}