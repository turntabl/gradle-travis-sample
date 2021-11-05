package io.turntabl.domain;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class PrivateClient extends Client{
    private String clientName;
    public PrivateClient(String name, ServiceLevel serviceLevel, String clientName) {
        super(name, serviceLevel);
        this.clientName = clientName;
        System.out.println(save("micke", String::length));
        System.out.println(get(String::concat));
    }

    public int save(String s, Function<String, Integer> saveMani) {
        return saveMani.apply(s);
    }

    public String get(BiFunction<String, String, String> concat) {
        return concat.apply("Mickey", "Loo");
    }

    public String useSupplier(Supplier<Integer> supply) {

       return supply.get().toString();

    }



}
