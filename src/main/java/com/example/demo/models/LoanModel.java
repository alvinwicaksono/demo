package com.example.demo.models;

import java.math.BigDecimal;

public class LoanModel {
    private BigDecimal pokok;
    private Integer tenor;
    private Double bunga;

    public BigDecimal getPokok() {
        return pokok;
    }

    public void setPokok(BigDecimal pokok) {
        this.pokok = pokok;
    }

    public Integer getTenor() {
        return tenor;
    }

    public void setTenor(Integer tenor) {
        this.tenor = tenor;
    }

    public Double getBunga() {
        return bunga;
    }

    public void setBunga(Double bunga) {
        this.bunga = bunga;
    }

}
