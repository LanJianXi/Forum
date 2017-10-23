package com.labber.forum.engine.entity;

import java.util.List;

/**
 * @author Tony
 * @create 2017 - 10 -23 -23:02
 */
public class Post extends BaseEntity{

    private String postId;
    private String postContent;
    private String postAttachment;
    private int postAttachmentType;
    private int status;
    private int postCommentNum;
    private int postGoodNum;
    private Account account;
    private List<PostComment> comments;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostAttachment() {
        return postAttachment;
    }

    public void setPostAttachment(String postAttachment) {
        this.postAttachment = postAttachment;
    }

    public int getPostAttachmentType() {
        return postAttachmentType;
    }

    public void setPostAttachmentType(int postAttachmentType) {
        this.postAttachmentType = postAttachmentType;
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

    public int getPostCommentNum() {
        return postCommentNum;
    }

    public void setPostCommentNum(int postCommentNum) {
        this.postCommentNum = postCommentNum;
    }

    public int getPostGoodNum() {
        return postGoodNum;
    }

    public void setPostGoodNum(int postGoodNum) {
        this.postGoodNum = postGoodNum;
    }

    public List<PostComment> getComments() {
        return comments;
    }

    public void setComments(List<PostComment> comments) {
        this.comments = comments;
    }
}


