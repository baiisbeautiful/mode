package cn.moshi.jianzaozhe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/30 9:57
 **/
public class Building {//建筑物
    //用来模拟房子组件的堆叠
    private List<String> buildingCompnents=new ArrayList<>();

    public void setBasement(String basement){//地基
        this.buildingCompnents.add(basement);
    }

    public void setWall(String wall){//墙体
        this.buildingCompnents.add(wall);
    }
    public void setRoof(String roof){//房顶
        this.buildingCompnents.add(roof);
    }

    @Override
    public String toString() {
        String buildingStr="";
        for (int i=buildingCompnents.size()-1;i>=0;i--){
            buildingStr+=buildingCompnents.get(i);
        }
        return buildingStr;
    }
}
