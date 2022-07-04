package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.LoanModel;

@Service
public class LoanServices {
    // public Double pokokBulan(LoanModel loanModel) {
    // Double result = loanModel.getPokok() / loanModel.getTenor();
    // return result;
    // }

    // public Double bungaBulan(LoanModel loanModel) {
    // Double result = loanModel.getPokok() * loanModel.getBunga();
    // return result;
    // }

    // public Double cicilanBulan(LoanModel loanModel) {
    // Double result = (loanModel.getPokok() / loanModel.getTenor())
    // - (loanModel.getTenor() * loanModel.getBunga());
    // return result;
    // }

    public List<String> hitung(LoanModel loanModel) {
        List<String> result = new ArrayList<>();

        Integer tenor = loanModel.getTenor();
        Double pkk = loanModel.getPokok().doubleValue();
        Double pinjamanPerBln = pkk / loanModel.getTenor();
        Double bungaPerBulan = pinjamanPerBln * (loanModel.getBunga() / 100);
        Double totalPinjaman = pinjamanPerBln + bungaPerBulan;
        Double sisaPinjaman = totalPinjaman * tenor;

        result.add("pokok = " + pkk);
        result.add("Tenor = " + loanModel.getTenor());
        result.add("Bunga = " + loanModel.getBunga());

        result.add("Pinjaman per Bulan: " + pinjamanPerBln);
        result.add("Bunga per Bulan: " + bungaPerBulan);
        result.add("Total Pinjaman: " + totalPinjaman);
        
        result.add("Ags  #  Pinjaman  #  Bunga  #  Cicilan Perbulan  #  Sisa Pinjaman");
        result.add(" -  #  -  #  -  #  -  #  " + sisaPinjaman);

        for (Integer a = 1; a <= tenor; a++) {
            sisaPinjaman = sisaPinjaman - totalPinjaman;
            result.add(a + " # " + pinjamanPerBln  + " # " + bungaPerBulan  + " # " + totalPinjaman  + " # " + sisaPinjaman);
        }

        return result;
    }

}
