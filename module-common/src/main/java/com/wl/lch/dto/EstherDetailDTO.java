package com.wl.lch.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EstherDetailDTO implements Serializable {
    private static final long serialVersionUID = 2409918142009009547L;

    private EstherDTO posts;

    private List<ReplyDTO> replys;

    public EstherDTO getPosts() {
        return posts;
    }

    public void setPosts(EstherDTO posts) {
        this.posts = posts;
    }

    public List<ReplyDTO> getReplys() {
        return replys;
    }

    public void setReplys(List<ReplyDTO> replys) {
        this.replys = replys;
    }
}
