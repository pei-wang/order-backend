package com.ecommerce.order.event.order;

import com.ecommerce.shared.model.Address;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;


@Getter
public class OrderCreatedEvent extends OrderEvent {
    private BigDecimal price;
    private Address address;
    private List<OrderItem> items;
    private Instant createdAt;


    @JsonCreator
    public OrderCreatedEvent(@JsonProperty("orderId") String orderId,
                             @JsonProperty("price") BigDecimal price,
                             @JsonProperty("address") Address address,
                             @JsonProperty("createdAt") Instant createdAt,
                             @JsonProperty("items") List<OrderItem> items) {
        super(orderId);
        this.price = price;
        this.createdAt = createdAt;
        this.address = address;
        this.items = items;
    }

}
