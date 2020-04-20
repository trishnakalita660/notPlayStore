package com.example.playstore.Lists;

public class appUpdate  {
    private int Images;
    private String Name;
    private String Size;
    private String whatsNew;
    private boolean expanded;

    public appUpdate(int images, String name, String size, String whatsNew) {
        Images = images;
        Name = name;
        Size = size;
        this.whatsNew = whatsNew;
       this.expanded=false;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public int getImages() {
        return Images;
    }

    public void setImages(int images) {
        Images = images;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getWhatsNew() {
        return whatsNew;
    }

    public void setWhatsNew(String whatsNew) {
        this.whatsNew = whatsNew;
    }
}




