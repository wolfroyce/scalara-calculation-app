package de.scalara.calculationapp.logic;

import de.scalara.calculationapp.exception.MyDummyException;
import de.scalara.calculationapp.model.CalculationRule;
import de.scalara.calculationapp.util.JSONReader;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.*;

public class CalculationLogic {

    JSONReader jsonReader = new JSONReader();

    public CalculationLogic() {
        // default constructor
    }

    public double executeCalculation(String id, double... inputs) {

        Map<String, Double> variableMapForExpression = null;
        try {
            variableMapForExpression = buildVariableMap(getVariablesById(id), inputs);
        } catch (Exception e) {
            e.printStackTrace();
        }


        Expression expression = new ExpressionBuilder(getRuleAsCodeById(id))
                .variables(convertArrayToSet(getVariablesById(id)))
                .build()
                .setVariables(variableMapForExpression);

        return expression.evaluate();
    }

    private Set<String> convertArrayToSet(String[] array) {
        return new HashSet<>(Arrays.asList(array));
    }

    private Map<String, Double> buildVariableMap(String[] variables, double... inputs) throws MyDummyException {
        Map<String, Double> variableMap = new HashMap<>();

        if (variables.length == inputs.length) {
            for (int i = 0; i < variables.length; i++) {
                variableMap.put(variables[i], inputs[i]);
            }
        } else {
            throw new MyDummyException("MyDummyException message");
        }

        return variableMap;

    }

    private String getRuleAsCodeById(String id) {
        CalculationRule calculationRule = getCalculationRule(id);

        return Objects.requireNonNull(calculationRule).getRuleAsCode();
    }

    public String[] getVariablesById(String id) {
        CalculationRule calculationRule = getCalculationRule(id);

        return Objects.requireNonNull(calculationRule).getVariables();
    }

    private CalculationRule getCalculationRule(String id) {
        List<CalculationRule> rules = jsonReader.getAllCalculationRules();

        return rules.stream()
                .filter(rule -> id.equals(rule.getId()))
                .findAny()
                .orElse(null);
    }

    public String[] getInputsById(String id) {
        CalculationRule calculationRule = getCalculationRule(id);

        return Objects.requireNonNull(calculationRule).getInputs();
    }

    public String getCalculationRuleById(String id) {
        CalculationRule calculationRule = getCalculationRule(id);

        return Objects.requireNonNull(calculationRule).getName();
    }


}

