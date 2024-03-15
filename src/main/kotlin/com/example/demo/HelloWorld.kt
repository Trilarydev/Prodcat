package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class HelloWorld {

    @GetMapping
    fun qwe() : String {
        return "Lista de productos"
    }

    @GetMapping("/{id}")
    fun asdas(
            @PathVariable id: String
    ) : String {
        return "producto $id"
    }

    @GetMapping("/{id}/details")
    fun asdasqwse(
            @PathVariable id: String
    ) : String {
        return "producto $id algun detalle precio, algo mas"
    }

    @PostMapping
    fun crear(
            @RequestBody body: String
    ) : String {
        return "Crear producto $body"
    }
}