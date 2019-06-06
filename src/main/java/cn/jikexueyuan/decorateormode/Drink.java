package cn.jikexueyuan.decorateormode;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/6 15:53
 **/
public abstract class Drink {
    public String description="";
    private float price=0f;

    public abstract float cost();

    public String getDescription() {
        return description+"-"+this.getPrice();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price= price;
    }


}
