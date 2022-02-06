package com.bilgeadam.odevarabaapp.controller;

import com.bilgeadam.odevarabaapp.entity.Araba;
import com.bilgeadam.odevarabaapp.exception.ArabaNotFoundException;
import com.bilgeadam.odevarabaapp.repository.ArabaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ArabaController {

    @Autowired
    private ArabaRepository arabaRepository;

    @GetMapping("/araba/{id}")
    public Araba getAraba(@PathVariable("id")long id)
    {

        Araba araba = null;
        Optional<Araba> arabaDB = arabaRepository.findById(id);

        if(arabaDB.isPresent())
        {
            araba = arabaDB.get();
            return araba;
        }
        else
        {
            throw new ArabaNotFoundException(id + "nolu Araba bulunamadı!");
        }
    }

    @GetMapping("/araba")
    public List<Araba> getTumArabalar()
    {
        return arabaRepository.findAll();
    }

    @GetMapping("/arabaad/{id}")
    public String getArabaAd(@PathVariable("id") long id)
    {

        Araba araba = getAraba(id);
        return araba.getAd();


        //return getBolum(id).getAd();

    }

    @PostMapping("/arabaEkle")
    public void addAraba(@RequestBody Araba araba) { arabaRepository.save(araba);}


}







