package guru.springframework.msscjacksonexample.model;

/*
 * Created by arunabhamidipati on 31/10/2019
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
@JsonTest
public class BeerDtoSnakeTest extends BeerTest{

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void beerSerializationTest() throws JsonProcessingException {
        BeerDto dto = getBeerDto();

        String jsonString = objectMapper.writeValueAsString(dto);
        System.out.println(jsonString);
    }
}
