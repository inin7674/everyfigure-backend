package com.everyfigure.everyfigure;

import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StoreCtl {

    @Autowired
    StoreSvc storeSvc;

    //검색
    @GetMapping("/findall")
    public List<Store> findall(){
        return storeSvc.findall();
    }

    //



}
