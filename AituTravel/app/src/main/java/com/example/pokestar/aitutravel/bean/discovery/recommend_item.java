package com.example.pokestar.aitutravel.bean.discovery;

public class recommend_item {
    private int recommendimage;
    private String recommendtitle;
    private String recommendcontent;
    private String recommendvalue;
    private String text_recommend;

    private int recommendimage_one;
    private String recommendtitle_one;
    private String recommendcontent_one;
    private String recommendvalue_one;

    private int recommendimage_two;
    private String recommendtitle_two;
    private String recommendcontent_two;
    private String recommendvalue_two;

    public recommend_item(int recommendimage, String recommendtitle,
                          String recommendcontent, String recommendvalue, String text_recommend,
                          int recommendimage_one, String recommendtitle_one, String recommendcontent_one,
                          String recommendvalue_one, int recommendimage_two, String recommendtitle_two,
                          String recommendcontent_two, String recommendvalue_two) {
        this.recommendimage = recommendimage;
        this.recommendtitle = recommendtitle;
        this.recommendcontent = recommendcontent;
        this.recommendvalue = recommendvalue;
        this.text_recommend = text_recommend;
        this.recommendimage_one = recommendimage_one;
        this.recommendtitle_one = recommendtitle_one;
        this.recommendcontent_one = recommendcontent_one;
        this.recommendvalue_one = recommendvalue_one;
        this.recommendimage_two = recommendimage_two;
        this.recommendtitle_two = recommendtitle_two;
        this.recommendcontent_two = recommendcontent_two;
        this.recommendvalue_two = recommendvalue_two;
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

    public String getText_recommend() {
        return text_recommend;
    }

    public void setText_recommend(String text_recommend) {
        this.text_recommend = text_recommend;
    }

    public int getRecommendimage_one() {
        return recommendimage_one;
    }

    public void setRecommendimage_one(int recommendimage_one) {
        this.recommendimage_one = recommendimage_one;
    }

    public String getRecommendtitle_one() {
        return recommendtitle_one;
    }

    public void setRecommendtitle_one(String recommendtitle_one) {
        this.recommendtitle_one = recommendtitle_one;
    }

    public String getRecommendcontent_one() {
        return recommendcontent_one;
    }

    public void setRecommendcontent_one(String recommendcontent_one) {
        this.recommendcontent_one = recommendcontent_one;
    }

    public String getRecommendvalue_one() {
        return recommendvalue_one;
    }

    public void setRecommendvalue_one(String recommendvalue_one) {
        this.recommendvalue_one = recommendvalue_one;
    }

    public int getRecommendimage_two() {
        return recommendimage_two;
    }

    public void setRecommendimage_two(int recommendimage_two) {
        this.recommendimage_two = recommendimage_two;
    }

    public String getRecommendtitle_two() {
        return recommendtitle_two;
    }

    public void setRecommendtitle_two(String recommendtitle_two) {
        this.recommendtitle_two = recommendtitle_two;
    }

    public String getRecommendcontent_two() {
        return recommendcontent_two;
    }

    public void setRecommendcontent_two(String recommendcontent_two) {
        this.recommendcontent_two = recommendcontent_two;
    }

    public String getRecommendvalue_two() {
        return recommendvalue_two;
    }

    public void setRecommendvalue_two(String recommendvalue_two) {
        this.recommendvalue_two = recommendvalue_two;
    }
}
