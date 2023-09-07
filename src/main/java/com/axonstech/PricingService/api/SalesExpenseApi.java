package com.axonstech.PricingService.api;

import com.axonstech.PricingService.model.SalesExpense;
import com.axonstech.PricingService.payload.SalesExpensePayload;
import com.axonstech.PricingService.service.SalesExpenseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salesexpense")
public class SalesExpenseApi {

    @Autowired
    private SalesExpenseDataService dataService;

    @PostMapping("/save")
    public String saveSalesExpense(@RequestBody SalesExpensePayload payload) {
        dataService.saveSalesExpense(payload);
        return "Success";
    }

    @GetMapping("/getAll")
    public List<SalesExpense> getAllSalesExpense() {
        return dataService.getAllSalesExpense();
    }
}
