package de.scalara.calculationapp.service;

import de.scalara.calculationapp.logic.CalculationLogic;
import de.scalara.calculationapp.model.CalculationRule;
import de.scalara.calculationapp.util.JSONReader;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculationRuleService {

    JSONReader jsonReader = new JSONReader();

    CalculationLogic calculationLogic = new CalculationLogic();

    public CalculationRuleService() {
        // default constructor
    }

    public List<CalculationRule> getAllCalculationRules() {
        return jsonReader.getAllCalculationRules();
    }

    public String[] getVariablesById(String id) {
        return calculationLogic.getVariablesById(id);
    }

    public String[] getInputsById(String id) {
        return calculationLogic.getInputsById(id);
    }

    public double executeCalculation(String id, double... inputs) {
        return calculationLogic.executeCalculation(id, inputs);
    }
}
