package com.zzy.chengyu.pojo.DO;

/**
 * @author 11723
 */
public class IdiomDO {

    private Integer id;

    /**
     * 成语名
     */
    private String name;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IdiomDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
