package com.example.khoaservice.service;

import com.example.khoaservice.entity.Khoa;
import com.example.khoaservice.repository.KhoaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class KhoaServiceImpl implements KhoaService {

    @Autowired
    private KhoaRepository khoaRepository;

    @Override
    public Khoa saveKhoa(Khoa khoa) {
        return khoaRepository.save(khoa);
    }

    @Cacheable(value = "khoa")
    @Override
    public Khoa findKhoaById(Long khoaId) {
        log.info("Cache start");
        return khoaRepository.findById(khoaId).get();
    }

    @Override
    public void updateKhoaById(Long khoaId, Khoa khoa) {
        Khoa khoa1 = khoaRepository.findById(khoaId).get();
        khoa1.setDeparmentName(khoa.getDeparmentName());
        khoa1.setDeparmentAddress(khoa.getDeparmentAddress());
        khoa1.setDeparmentCode(khoa.getDeparmentCode());
        khoaRepository.save(khoa1);
    }

    @Override
    public void deleteKhoaById(Long khoaId) {
        khoaRepository.deleteById(khoaId);
    }

    @Override
    public List<Khoa> findAllKhoa() {
        return khoaRepository.findAll();
    }
}
