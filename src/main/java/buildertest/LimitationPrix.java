package buildertest;

import net.karneim.pojobuilder.GeneratePojoBuilder;

import java.beans.ConstructorProperties;

/**
 * Created by killbulle on 11/01/15.
 */
public class LimitationPrix {

    private long tax;

    @GeneratePojoBuilder(withBuilderInterface = Builder.class,withBuilderProperties = true)
    @ConstructorProperties({"tax"} )
    public LimitationPrix(long tax) {
        this.tax = tax;
    }
}
