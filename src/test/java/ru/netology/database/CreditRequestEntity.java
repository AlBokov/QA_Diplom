package ru.netology.database;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class CreditRequestEntity {
    String id;
    String bank_id;
    String created;
    String status;
}