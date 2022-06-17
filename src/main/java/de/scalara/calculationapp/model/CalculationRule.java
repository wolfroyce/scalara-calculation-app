package de.scalara.calculationapp.model;

import java.io.Serializable;
import java.util.Arrays;

public class CalculationRule implements Serializable {

    private String id;
    private String name;
    private String description;
    private String[] inputs;
    private String rule;
    private String[] variables;
    private String ruleAsCode;

    public CalculationRule(String id, String name, String description, String[] inputs, String rule,
                           String[] variables, String ruleAsCode) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.inputs = inputs;
        this.rule = rule;
        this.variables = variables;
        this.ruleAsCode = ruleAsCode;
    }

    public CalculationRule() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String[] getInputs() {
        return inputs;
    }

    public String getRule() {
        return rule;
    }

    public String[] getVariables() {
        return variables;
    }

    public String getRuleAsCode() {
        return ruleAsCode;
    }

    @Override
    public String toString() {
        return "CalculationRule{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", inputs=" + Arrays.toString(inputs) +
                ", calculationRule='" + rule + '\'' +
                ", variables=" + Arrays.toString(variables) +
                ", ruleAsCode='" + ruleAsCode + '\'' +
                '}';
    }
}
