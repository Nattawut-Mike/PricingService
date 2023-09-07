package com.axonstech.PricingService.payload;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTyped;
import com.axonstech.PricingService.model.SalesExpense;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.joda.time.DateTime;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class SalesExpensePayload {

    private String id;
    private String companyCode;
    private String zoneArea;
    private String zoneClassPrice;
    private String productGroup;
    private String effectiveDate;
    private String createBy;
    private String lastUpdateBy;
    private String productGroupName;
    private Integer percentSellingExp;
    private Integer percentGaExp;
    private Boolean status;
    private Date createDateTime;
    private Date lastUpdateDateTime;
    private Date expireDate;
}
