package com.example.khoaservice.controller;

import com.example.khoaservice.entity.Khoa;
import com.example.khoaservice.service.KhoaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/khoa")
@Slf4j
public class KhoaController {

    @Autowired
    private KhoaService khoaService;

    @PostMapping("/")
    public Khoa saveKhoa(@RequestBody Khoa khoa){
        return khoaService.saveKhoa(khoa);
    }

    @GetMapping("/{id}")
    public Khoa findKhoaById(@PathVariable(value = "id") Long khoaId){
        return khoaService.findKhoaById(khoaId);
    }

    @DeleteMapping("/{id}")
    public String deleteKhoaById(@PathVariable("id") Long khoaId){
        khoaService.deleteKhoaById(khoaId);
        return "xóa thành công";
    }

    @GetMapping("/")
    public List<Khoa> getAllKhoa(){
       return khoaService.findAllKhoa();
    }

    @PutMapping("/{id}")
    public String updateKhoaById(@PathVariable("id") Long khoaId, @RequestBody Khoa khoa){
        khoaService.updateKhoaById(khoaId, khoa);
        return "update thành công";
    }
}
