package com.axonstech.PricingService.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.axonstech.PricingService.model.SalesExpense;
import com.axonstech.PricingService.payload.SalesExpensePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesExpenseDataService {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public void saveSalesExpense(SalesExpensePayload payload) {

        SalesExpense salesExpenseOjb = new SalesExpense();

        salesExpenseOjb.setId(payload.getId());
        salesExpenseOjb.setCompanyCode(payload.getCompanyCode());
        salesExpenseOjb.setZoneArea(payload.getZoneArea());
        salesExpenseOjb.setZoneClassPrice(payload.getZoneClassPrice());
        salesExpenseOjb.setProductGroup(payload.getProductGroup());
        salesExpenseOjb.setEffectiveDate(payload.getEffectiveDate());
        salesExpenseOjb.setCreateBy(payload.getCreateBy());
        salesExpenseOjb.setLastUpdateBy(payload.getLastUpdateBy());
        salesExpenseOjb.setProductGroupName(payload.getProductGroupName());
        salesExpenseOjb.setPercentSellingExp(payload.getPercentSellingExp());
        salesExpenseOjb.setPercentGaExp(payload.getPercentGaExp());
        salesExpenseOjb.setStatus(payload.getStatus());
        salesExpenseOjb.setCreateDateTime(payload.getCreateDateTime());
        salesExpenseOjb.setLastUpdateDateTime(payload.getLastUpdateDateTime());
        salesExpenseOjb.setExpireDate(payload.getExpireDate());

        dynamoDBMapper.save(salesExpenseOjb);

    }

    public List<SalesExpense> getAllSalesExpense () {
        return dynamoDBMapper.scan(SalesExpense.class, new DynamoDBScanExpression());
    }



}
