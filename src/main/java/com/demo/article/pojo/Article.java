package com.demo.article.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 小王八
 * @since 2022-09-20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("article")
@Accessors(chain = true)
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId("pk_id")
    private Long pkId;


    @TableField("article_name")
    private String articleName;


    @TableField("article_author")
    private String articleAuthor;


    @TableField(value = "gmt_create", fill = FieldFill.INSERT)
    private LocalDateTime gmtCreate;


    @TableField("article_url")
    private String articleUrl;


    @TableField("article_show_pic")
    private String articleShowPic;


}
