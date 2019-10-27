package mum.edu.domain;

import java.io.Serializable;

public class Calculator implements Serializable {
    private static final long serialVersionUID = 748392348L;

    private Integer add1;
    private Integer add2;

    private Integer mult1;
    private Integer mult2;


    private Integer sum;
    private Integer product;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getAdd1() {
        return add1;
    }

    public void setAdd1(Integer add1) {
        this.add1 = add1;
    }

    public Integer getAdd2() {
        return add2;
    }

    public void setAdd2(Integer add2) {
        this.add2 = add2;
    }

    public Integer getMult1() {
        return mult1;
    }

    public void setMult1(Integer mult1) {
        this.mult1 = mult1;
    }

    public Integer getMult2() {
        return mult2;
    }

    public void setMult2(Integer mult2) {
        this.mult2 = mult2;
    }

    public Integer getSum() {

        if (this.add1==null)
        {
            this.add1=0;
        }

        if (this.add2==null)
        {
            this.add2=0;
        }

        this.sum=this.add1+this.add2;
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getProduct() {
        if (this.mult1==null)
        {
            this.mult1=0;
        }

        if (this.mult2==null)
        {
            this.mult2=0;
        }

        this.product=this.mult1*this.mult2;
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }
}
