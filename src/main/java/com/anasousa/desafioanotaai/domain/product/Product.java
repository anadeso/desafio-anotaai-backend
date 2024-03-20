package com.anasousa.desafioanotaai.domain.product;

import com.anasousa.desafioanotaai.domain.category.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "products")
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    private String id;
    private String title;
    private String description;
    private String ownerId;

    // Vou salvar no banco sem virgula, logo vou multiplicar por 100
    // para remocao das virgulas ao consulta no banco vou dividir por 100
    private Integer price;
    private Category category;
}
