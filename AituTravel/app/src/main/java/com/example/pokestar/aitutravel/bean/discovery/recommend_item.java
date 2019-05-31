package com.example.pokestar.aitutravel.bean.discovery;

public class recommend_item {
    private int recommendimage;
    private String recommendtitle;
    private String recommendcontent;
    private String recommendvalue;

    public recommend_item(int recommendimage, String recommendtitle, String recommendcontent, String recommendvalue) {
        this.recommendimage = recommendimage;
        this.recommendtitle = recommendtitle;
        this.recommendcontent = recommendcontent;
        this.recommendvalue = recommendvalue;
    }

    public int getRecommendimage() {
        return recommendimage;
    }

    public void setRecommendimage(int recommendimage) {
        this.recommendimage = recommendimage;
    }

    public String getRecommendtitle() {
        return recommendtitle;
    }

    public void setRecommendtitle(String recommendtitle) {
        this.recommendtitle = recommendtitle;
    }

    public String getRecommendcontent() {
        return recommendcontent;
    }

    public void setRecommendcontent(String recommendcontent) {
        this.recommendcontent = recommendcontent;
    }

    public String getRecommendvalue() {
        return recommendvalue;
    }

    public void setRecommendvalue(String recommendvalue) {
        this.recommendvalue = recommendvalue;
    }
}
