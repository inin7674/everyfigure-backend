package com.everyfigure.everyfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreSvc {
    @Autowired
    StoreRepository storeRepository;





    public List<Store> findall(){
        return storeRepository.findAll();
    }
}
