package guru.springframework.msscjacksonexample.model;

/*
 * Created by arunabhamidipati on 31/10/2019
 */

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;

public class BeerTest {
    BeerDto getBeerDto(){
        return BeerDto.builder()
                .beerName("Carona")
                .beerStyle("Lager")
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(new BigDecimal("12.99"))
                .upc(123412341234L)
                .myLocalDate(LocalDate.now())
                .build();
    }

}
