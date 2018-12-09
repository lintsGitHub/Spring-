package priv.lint;


import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
    /*
    * 对于普通是属性我就不列举了
    * 主要对集合属性进行设值注入
    * */

    List list;
    Set set;
    Map map;
    Properties properties;

    @Override
    public String toString() {
        return "Student{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
