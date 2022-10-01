package com.demo.article.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.article.pojo.Article;
import com.demo.article.mapper.ArticleMapper;
import com.demo.article.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 小王八
 * @since 2022-09-20
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

    @Override
    public boolean toSaveArticleList(List<Article> articleList) {
        return saveBatch(articleList);
    }
}
