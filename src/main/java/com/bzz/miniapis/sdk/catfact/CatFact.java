package com.bzz.miniapis.sdk.catfact;

/**
 * CatFact 返回实体
 *
 * @author bzz
 */
public class CatFact {

    private String fact;
    private Integer length;

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
