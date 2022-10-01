package com.demo.article.mapper;

import com.demo.article.pojo.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 小王八
 * @since 2022-09-20
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}
