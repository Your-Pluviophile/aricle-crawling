package com.demo.article.service;

import com.demo.article.pojo.Article;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 小王八
 * @since 2022-09-20
 */
public interface ArticleService extends IService<Article> {
    /**
      *保存文章数组
      * @param articleList 文章数组
      * @return boolean
      * @author zhangjunrong
      * @date 2022/9/20 19:46
      */
    boolean toSaveArticleList(List<Article> articleList);
}
