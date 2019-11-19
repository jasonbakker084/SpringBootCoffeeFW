package com.teamcoffee.coffeeflavourwheel.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tastedcoffee")
public class TastedCoffee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String coffeeName;
    private String roaster;
    private String roastColor;
    private String processingMethod;
    private String tastingMethod;
    private String beanType;

    public TastedCoffee() {}

    public TastedCoffee(String coffeeName, String roaster, String roastColor, String processingMethod, String tastingMethod, String beanType) {
        this.coffeeName = coffeeName;
        this.roaster = roaster;
        this.roastColor = roastColor;
        this.processingMethod = processingMethod;
        this.tastingMethod = tastingMethod;
        this.beanType = beanType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getRoaster() {
        return roaster;
    }

    public void setRoaster(String roaster) {
        this.roaster = roaster;
    }

    public String getRoastColor() {
        return roastColor;
    }

    public void setRoastColor(String roastColor) {
        this.roastColor = roastColor;
    }

    public String getProcessingMethod() {
        return processingMethod;
    }

    public void setProcessingMethod(String processingMethod) {
        this.processingMethod = processingMethod;
    }

    public String getTastingMethod() {
        return tastingMethod;
    }

    public void setTastingMethod(String tastingMethod) {
        this.tastingMethod = tastingMethod;
    }

    public String getBeanType() {
        return beanType;
    }

    public void setBeanType(String beanType) {
        this.beanType = beanType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TastedCoffee tastedCoffee = (TastedCoffee) o;
        return Objects.equals(id,
                tastedCoffee.id) &&
                Objects.equals(coffeeName, tastedCoffee.coffeeName) &&
                Objects.equals(roaster, tastedCoffee.roaster) &&
                Objects.equals(roastColor, tastedCoffee.roastColor) &&
                Objects.equals(processingMethod, tastedCoffee.processingMethod) &&
                Objects.equals(tastingMethod, tastedCoffee.tastingMethod) &&
                Objects.equals(beanType, tastedCoffee.beanType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, coffeeName, roaster, roastColor, processingMethod, tastingMethod, beanType);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", coffeeName='").append(coffeeName).append('\'');
        sb.append(", roaster='").append(roaster).append('\'');
        sb.append(", roastColor='").append(roastColor).append('\'');
        sb.append(", processingMethod='").append(processingMethod).append('\'');
        sb.append(", tastingMethod='").append(tastingMethod).append('\'');
        sb.append(", beanType='").append(beanType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}