package com.example.khoaservice.service;

import com.example.khoaservice.entity.Khoa;

import java.util.List;

public interface KhoaService {
    Khoa saveKhoa(Khoa khoa);
    Khoa findKhoaById(Long khoaId);
    void updateKhoaById(Long khoaId, Khoa khoa);
    void deleteKhoaById(Long khoaId);
    List<Khoa> findAllKhoa();
}
