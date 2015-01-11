package buildertest;

import java.util.Date;
import java.util.HashSet;

/**
 * Created by killbulle on 11/01/15.
 */
public class DomainBuilderFactory {

    public static ProduitBuilder $DefaultProduct() {
        return new ProduitBuilder().
            withLimitationConfort(
                new LimitationConfortBuilder()
                        .withDate(new Date())
                        .withName("test").build())
                .withLimitationPrix(
                        new LimitationPrixBuilder()
                                .withTax(25L).build()
                )
                .withConforts(new HashSet<>());
    }
}
