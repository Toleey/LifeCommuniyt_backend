package com.toleey.lifecommunity.dao;

import com.toleey.lifecommunity.pojo.Comment;
import com.toleey.lifecommunity.pojo.Discuss;

import java.util.List;

public interface CommentMapper {
    //根据作品id查找评论
    public List<Discuss> findAWorkComment(Integer workId);

    //根据作品id以及用户phoneNumber发表评论
    public Integer insertAComment(Comment comment);

    //评论点赞
    public Integer addALike(Integer commentId);

}
