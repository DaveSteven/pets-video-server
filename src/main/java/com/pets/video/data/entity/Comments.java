package com.pets.video.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comments {
    private String id;

    private String fatherCommentId;

    private String toUserId;

    private String videoId;

    private String fromUserId;

    private Date createTime;

    private String comment;
}