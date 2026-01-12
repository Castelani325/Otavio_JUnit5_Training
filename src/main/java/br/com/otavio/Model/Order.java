package br.com.otavio.Model;

import java.time.LocalDateTime;

public class Order {


    private String productName;
    private Long amount;
    private String id;
    private LocalDateTime creationDate;

    public String getId() {
        return id;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public Long getAmount() {
        return amount;
    }

    public String getProductName() {
        return productName;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


}
