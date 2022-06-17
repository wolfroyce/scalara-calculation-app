package de.scalara.calculationapp.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.scalara.calculationapp.model.CalculationRule;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class JSONReader {

    public List<CalculationRule> getAllCalculationRules() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(
                    new File("src/main/resources/calculationRules.json"),
                    new TypeReference<>() {
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }

}
