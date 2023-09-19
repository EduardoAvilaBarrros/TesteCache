package com.senac.TesteCache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TesteCacheService {

    @Cacheable(value = "teste", key = "#key")
    public String getValor(String key){
        return  "Retor é: " + key;
    }

    @CacheEvict(value = "teste", allEntries = true)
    public void limparCache(){

    }

}
