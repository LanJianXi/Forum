package com.labber.forum.engine.entity;

/**
 * @author Tony
 * @create 2017 - 10 -23 -23:09
 */
public class PostComment extends BaseEntity{

    private String commentId;
    private String commentContent;
    private String commentAttachment;
    private int commentAttachmentType;
    private String postId;
    private String parentId;
    private int status;
    private Account accountId;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentAttachment() {
        return commentAttachment;
    }

    public void setCommentAttachment(String commentAttachment) {
        this.commentAttachment = commentAttachment;
    }

    public int getCommentAttachmentType() {
        return commentAttachmentType;
    }

    public void setCommentAttachmentType(int commentAttachmentType) {
        this.commentAttachmentType = commentAttachmentType;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }
}
