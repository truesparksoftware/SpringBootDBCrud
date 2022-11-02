package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


// model class / pojo class/ entity class
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BankData {
  private String id;
  private String name;
  private String loc;
}
