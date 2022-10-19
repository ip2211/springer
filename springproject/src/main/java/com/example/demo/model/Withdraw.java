package com.example.demo.model;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Setter
@Document(collection="withdraw")
@AllArgsConstructor
@NoArgsConstructor
public class Withdraw {
private String accNo;
private int amount;
}