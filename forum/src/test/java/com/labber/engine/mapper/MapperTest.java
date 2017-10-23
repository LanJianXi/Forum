package com.labber.engine.mapper;

import com.labber.forum.engine.entity.Account;
import com.labber.forum.engine.entity.PostComment;
import com.labber.forum.engine.mapper.PostCommentMapper;
import com.lanbber.common.utils.IdUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author Tony
 * @create 2017 - 10 -23 -23:37
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
public class MapperTest {

    @Resource
    private PostCommentMapper postCommentMapper;

    @Test
    public void testRun() {
        PostComment pc = new PostComment();
        Account account = new Account();
        account.setAccountId(IdUtils.uuid());
        pc.setAccountId(account);
        pc.setCommentId(IdUtils.uuid());
        pc.setCommentAttachment("attachment");
        pc.setCommentAttachmentType(0);
        pc.setCommentContent("comment content");
        pc.setParentId(IdUtils.uuid());
        pc.setStatus(1);
        pc.setPostId(IdUtils.uuid());

        postCommentMapper.insert(pc);
    }
}
