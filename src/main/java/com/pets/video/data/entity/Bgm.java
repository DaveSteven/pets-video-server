package com.pets.video.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bgm {
    private String id;

    private String author;

    private String name;

    private String path;
}