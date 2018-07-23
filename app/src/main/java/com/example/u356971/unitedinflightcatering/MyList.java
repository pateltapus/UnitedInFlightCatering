package com.example.u356971.unitedinflightcatering;

public class MyList {
    private String head;
    private String desc;
    private String tag;
    private int image;
    //constructor initializing values
    public MyList(String head, String desc, String tag, int image) {
        this.head = head;
        this.desc = desc;
        this.tag = tag;
        this.image = image;
    }

    //getters
    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

    public String getTag() {
        return tag;
    }

    public int getImage() {
        return image;
    }
}
