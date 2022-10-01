package com.demo.article.pojo.ro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @Description 爬虫 保存文章
 * @Author 小乌龟
 * @Date 2022/8/1 22:36
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ToSaveArticle {
    /**
     *文章名称
     */
    private String articleName;

    /**
     *作者名
     */
    private String author;

    /**
     *展示图片url
     */
    private String picShowUrl;

    /**
      *外部文章链接
      */
    private String articleLink;

    /**
     *发布时间
     */
    private LocalDateTime gmtModified;

}
