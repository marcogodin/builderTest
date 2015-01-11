import buildertest.DomainBuilderFactory;
import buildertest.Produit;
import org.junit.Test;

import static buildertest.DomainBuilderFactory.*;

/**
 * Created by killbulle on 11/01/15.
 */
public class TestBuilder {


@Test
    public void testFactory()
{
    final Produit produit = $DefaultProduct().build();
    System.out.println(produit);
  $DefaultProduct().copy(produit);
}

}
