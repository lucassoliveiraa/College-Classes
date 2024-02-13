package com.example.backend.Controle;

import java.util.List;
import java.util.stream.Collectors;

import com.example.backend.Modelo.Imovel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.backend.Repositorio.ImovelRepositorio;

import org.springframework.beans.BeanUtils;

@RestController
@RequestMapping("/imovel")
@CrossOrigin(origins = "http://localhost:5173")
public class ImovelControle {
    @Autowired
    private ImovelRepositorio repositorio;


    @GetMapping("/listar")
    public ResponseEntity<List<Imovel>> listar() {
        var imoveis = repositorio.findAll();
        return ResponseEntity.ok(imoveis);  
    }

    @GetMapping("/listar/{bairro}")
    public ResponseEntity<List<Imovel>> listar(@PathVariable String bairro) {
        var imoveis = repositorio.findAll();
        var imoveisBairro = imoveis.stream().filter(imovel ->imovel.getBairro().equals(bairro)).collect(Collectors.toList());
        return ResponseEntity.ok(imoveisBairro)
    
            /*var imoveisBairro
            for(Imovel imovel : imoveis) {
                if (imovel.getBairro().equals(bairro)) {
                    
                }
            }*/
           ;
    }

    //Depois criar construturores na classe imóvel e usar o id vindo da requisão para utilizalos
    @PostMapping("/cadastrar")
    public Imovel cadastrar(@RequestBody Imovel imovel) {
        return repositorio.save(imovel);
    }
    
    @GetMapping("/editar/{id}")
    public ResponseEntity<Imovel> editar(@PathVariable Integer id) {
        var pegarImovel = repositorio.findById(id);
        if (pegarImovel.isPresent()) {
            Imovel imovel = pegarImovel.get();
            return ResponseEntity.ok(imovel);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<Imovel> salvarEdicao(@PathVariable Integer id, @RequestBody Imovel imovelAtualizado) {
        var pegarImovel = repositorio.findById(id);

        if (pegarImovel.isPresent()) {
            Imovel imovelDepreciado = pegarImovel.get();
            BeanUtils.copyProperties(imovelAtualizado, imovelDepreciado);

            imovelAtualizado = repositorio.save(imovelDepreciado);
            return ResponseEntity.ok(imovelAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deletar/{id}")
    public void remover(@PathVariable Integer id) {
        var imovel = repositorio.findById(id);
        
        if (imovel.isPresent()) {
            Imovel imovelDeletar = imovel.get();
            repositorio.delete(imovelDeletar); 
        } else {
            ResponseEntity.notFound().build();
        }
    }
}

