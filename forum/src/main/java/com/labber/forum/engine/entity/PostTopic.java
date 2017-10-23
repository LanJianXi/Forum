package com.labber.forum.engine.entity;

import java.util.List;

/**
 * @author Tony
 * @create 2017 - 10 -23 -23:05
 */
public class PostTopic extends BaseEntity{

    private String topicId;
    private String topicContent;
    private String topicAttachment;
    private int topicAttachmentType;
    private int status;
    private String plateId;
    private int topicHeat;
    private int commentNum;
    private int postNum;
    private int topicClickNum;
    private Account account;//所属用户
    private Plate plate;//所属板块
    private List<Post> posts;//帖子

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }

    public String getTopicAttachment() {
        return topicAttachment;
    }

    public void setTopicAttachment(String topicAttachment) {
        this.topicAttachment = topicAttachment;
    }

    public int getTopicAttachmentType() {
        return topicAttachmentType;
    }

    public void setTopicAttachmentType(int topicAttachmentType) {
        this.topicAttachmentType = topicAttachmentType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getPlateId() {
        return plateId;
    }

    public void setPlateId(String plateId) {
        this.plateId = plateId;
    }

    public int getTopicHeat() {
        return topicHeat;
    }

    public void setTopicHeat(int topicHeat) {
        this.topicHeat = topicHeat;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    public int getTopicClickNum() {
        return topicClickNum;
    }

    public void setTopicClickNum(int topicClickNum) {
        this.topicClickNum = topicClickNum;
    }

    public Plate getPlate() {
        return plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}

