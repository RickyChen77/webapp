package com.cpt202example.ex1.controller;

import com.cpt202example.ex1.model.Kid;
import com.cpt202example.ex1.repository.KidRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ricky
 **/
//Spring Boot project! need to tell it this is a class and manage it, so that it could listen to the web
@RestController //springboot annotation可以听从http的请求但是需要一直运行才能接收到请求消息！
public class Ex1Controller {
    @Autowired  //get a instance of kidRepo
    private KidRepo kidRepo;
    @GetMapping("/api/hello")
    public String sayHello(){
        return "hello? CAN you see me?";
    }

    @GetMapping("/api/kids")
    public Kid getKid(){
        Kid kid = new Kid(0,"kim",6);
        return kid; //call the api and present it in the web
    }
    @GetMapping("/api/listkids")//only respond to get request
    public List<Kid> getKid1(){
        List<Kid> kids = new ArrayList<>();
        Kid kid = new Kid(0,"kim",6);
        kids.add(kid);
        kid = new Kid(2,"arrtm",9);
        kids.add(kid);
        return kids; //call the api and present it in the web
    }
    @PostMapping("/api/kid")
    public void  saveKid(@RequestBody Kid kid){
        kidRepo.save(kid);
    }

}
