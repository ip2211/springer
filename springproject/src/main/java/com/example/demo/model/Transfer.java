package com.example.demo.model;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "transfer")
public class Transfer {
private String accNo1;
private String accNo2;
private float amount;
}