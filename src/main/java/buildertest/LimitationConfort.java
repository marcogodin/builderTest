package buildertest;

import net.karneim.pojobuilder.GeneratePojoBuilder;

import java.beans.ConstructorProperties;
import java.util.Date;


public class LimitationConfort {
    private String name;
    private Date date;

    @Override
    public String toString() {
        return "buildertest.LimitationConfort{" +
                "date=" + date +
                ", name='" + name + '\'' +
                '}';
    }

    @GeneratePojoBuilder(withBuilderInterface = Builder.class,withBuilderProperties = true)
    @ConstructorProperties({"name","date"} )
    public LimitationConfort(String name, Date date) {
        this.name = name;
        this.date = date;
    }
}
