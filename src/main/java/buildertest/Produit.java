package buildertest;

import net.karneim.pojobuilder.GeneratePojoBuilder;

import javax.validation.ConstraintViolationException;
import javax.validation.constraints.NotNull;
import java.beans.ConstructorProperties;


import java.util.Set;



@GeneratePojoBuilder(withCopyMethod = true,withValidator = DomainAnnotationValidator.class)
public class Produit {


    public Produit() {
    }

    @NotNull
    private Set<LimitationConfort> conforts;

    @NotNull
    private LimitationConfort limitationConfort;

    public Set<LimitationConfort> getConforts() {
        return conforts;
    }

    public void setConforts(Set<LimitationConfort> conforts) {
        this.conforts = conforts;
    }

    public LimitationConfort getLimitationConfort() {
        return limitationConfort;
    }

    public void setLimitationConfort(LimitationConfort limitationConfort) {
        this.limitationConfort = limitationConfort;
    }

    public LimitationPrix getLimitationPrix() {
        return limitationPrix;
    }

    public void setLimitationPrix(LimitationPrix limitationPrix) {
        this.limitationPrix = limitationPrix;
    }

    @NotNull
    private LimitationPrix limitationPrix;

    public Produit(LimitationConfort limitationConfort,LimitationPrix limitationPrix,Set<LimitationConfort> conforts) {
        this.limitationConfort = limitationConfort;
        this.limitationPrix=limitationPrix;
        this.conforts=conforts;
    }

    @Override
    public String toString() {
        return "buildertest.Produit{" +
                "limitationConfort=" + limitationConfort +
                ", limitationPrix=" + limitationPrix +
                '}';
    }

//    public static void main(String[] args) {
//
//        try {
//           //$DefaultProduct();
//        } catch (ConstraintViolationException e) {
//            System.out.println(e.getConstraintViolations());
//            e.printStackTrace();
//        }

//    }
}
