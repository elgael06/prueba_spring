package com.elgael06.prueba.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/user")
class UserController {

    @RequestMapping( "prueba")
    fun prueba():String{
        return "esta es una prueba de controlador.";
    }

    @RequestMapping("prueba/lista")
    fun listaPruebas_algo(
        @RequestParam(
            required = false,
            defaultValue = "producto"
        ) nombre:String
    ):List<String> {
        println("algo $nombre")
        return listOf("$nombre ","$nombre 2","$nombre 3")
    }
}