package de.scalara.calculationapp;

import de.scalara.calculationapp.model.CalculationRule;
import de.scalara.calculationapp.service.CalculationRuleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calculationRule")
public class CalculationRuleResource {

    private final CalculationRuleService calculationRuleService;

    public CalculationRuleResource(CalculationRuleService calculationRuleService) {
        this.calculationRuleService = calculationRuleService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CalculationRule>> getAllCalculationRules() {
        List<CalculationRule> calculationRules = calculationRuleService.getAllCalculationRules();

        return new ResponseEntity<>(calculationRules, HttpStatus.OK);
    }

    @GetMapping("/inputsById/{id}")
    public ResponseEntity<String[]> getInputsById(@PathVariable("id") String id) {
        String[] inputs = calculationRuleService.getInputsById(id);

        return new ResponseEntity<>(inputs, HttpStatus.OK);
    }

    @GetMapping("/variablesById/{id}")
    public ResponseEntity<String[]> getVariablesById(@PathVariable("id") String id) {
        String[] variables = calculationRuleService.getVariablesById(id);

        return new ResponseEntity<>(variables, HttpStatus.OK);
    }

    @GetMapping("/calculationExecution/{id}/{inputs}")
    public ResponseEntity<Double> executeCalculation(@PathVariable("id") String id, @PathVariable("inputs") double[] inputs) {
        double result = calculationRuleService.executeCalculation(id, inputs);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
