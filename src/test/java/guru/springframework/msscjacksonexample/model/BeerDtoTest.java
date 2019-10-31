package guru.springframework.msscjacksonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import static org.junit.jupiter.api.Assertions.*;


/*
 * Created by arunabhamidipati on 31/10/2019
 */

@JsonTest
class BeerDtoTest extends BeerTest{

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeSerializeJson() throws JsonProcessingException {
        String jsonString="{\"id\":null,\"beerName\":\"Carona Lager\",\"beerStyle\":\"Lager\",\"upc\":123412341234,\"price\":12.99,\"createdDate\":\"2019-10-31T10:14:48.539705Z\",\"lastUpdatedDate\":\"2019-10-31T10:14:48.540588Z\"}";

        BeerDto beerDto = objectMapper.readValue(jsonString, BeerDto.class);

        System.out.println(beerDto);
    }


}