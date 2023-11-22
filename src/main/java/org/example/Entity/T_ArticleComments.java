package org.example.Entity;

public class T_ArticleComments {

    private int ID;
    private String ArticleID;  //文章ID
    private String CommentsID; //评论的ID

    private String FatherCommentsID;
    private String CommenterName; //评论人昵称
    private String CommenterID; //评论人ID
    private String CommentsText; //评论内容

    private String PushLocation;//发布地址
    private String CreateTime;//发布时间

    private String ReplyCount;//回复个数
    private String DiggCount;//被赞个数

    private String Has_multi_media;
    private String Bury_count;
    private String User_profile_image_url;
    private String Is_loyal_fan;
    private String Has_author_digg;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getArticleID() {
        return ArticleID;
    }

    public void setArticleID(String articleID) {
        ArticleID = articleID;
    }

    public String getCommentsID() {
        return CommentsID;
    }

    public void setCommentsID(String commentsID) {
        CommentsID = commentsID;
    }

    public String getCommenterName() {
        return CommenterName;
    }

    public void setCommenterName(String commenterName) {
        CommenterName = commenterName;
    }

    public String getCommenterID() {
        return CommenterID;
    }

    public void setCommenterID(String commenterID) {
        CommenterID = commenterID;
    }

    public String getCommentsText() {
        return CommentsText;
    }

    public void setCommentsText(String commentsText) {
        CommentsText = commentsText;
    }

    public String getPushLocation() {
        return PushLocation;
    }

    public void setPushLocation(String pushLocation) {
        PushLocation = pushLocation;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getReplyCount() {
        return ReplyCount;
    }

    public void setReplyCount(String replyCount) {
        ReplyCount = replyCount;
    }

    public String getDiggCount() {
        return DiggCount;
    }

    public void setDiggCount(String diggCount) {
        DiggCount = diggCount;
    }

    public String getHas_multi_media() {
        return Has_multi_media;
    }

    public void setHas_multi_media(String has_multi_media) {
        Has_multi_media = has_multi_media;
    }

    public String getBury_count() {
        return Bury_count;
    }

    public void setBury_count(String bury_count) {
        Bury_count = bury_count;
    }

    public String getUser_profile_image_url() {
        return User_profile_image_url;
    }

    public void setUser_profile_image_url(String user_profile_image_url) {
        User_profile_image_url = user_profile_image_url;
    }

    public String getIs_loyal_fan() {
        return Is_loyal_fan;
    }

    public void setIs_loyal_fan(String is_loyal_fan) {
        Is_loyal_fan = is_loyal_fan;
    }

    public String getHas_author_digg() {
        return Has_author_digg;
    }

    public void setHas_author_digg(String has_author_digg) {
        Has_author_digg = has_author_digg;
    }

    public String getFatherCommentsID() {
        return FatherCommentsID;
    }

    public void setFatherCommentsID(String fatherCommentsID) {
        FatherCommentsID = fatherCommentsID;
    }
}
