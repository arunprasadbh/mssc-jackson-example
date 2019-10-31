package guru.springframework.msscjacksonexample.model;

/*
 * Created by arunabhamidipati on 31/10/2019
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BeerTest{

    @Autowired
    ObjectMapper mapper;

    @Test
    void testJsonDto() throws JsonProcessingException {
        BeerDto dto = getBeerDto();

        String jsonString = mapper.writeValueAsString(dto);

        System.out.println(jsonString);
    }
}
