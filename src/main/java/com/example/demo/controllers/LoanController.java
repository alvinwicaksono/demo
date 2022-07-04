package com.example.demo.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.LoanModel;
import com.example.demo.services.LoanServices;

@RestController
@RequestMapping("/loan")
public class LoanController {
    @Autowired
    LoanServices loanServices;

    @PostMapping(value = "/hasil")
    public ResponseEntity<List<String>> postHitung(@RequestBody LoanModel loanModel) {
        List<String> response = loanServices.hitung(loanModel);
        return ResponseEntity.ok(response);
    }

}
