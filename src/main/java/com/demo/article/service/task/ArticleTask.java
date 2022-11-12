package com.demo.article.service.task;

import cn.hutool.core.util.ObjectUtil;
import com.demo.article.pojo.Article;
import com.demo.article.service.ArticleService;
import com.demo.article.utils.HtmlParseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Component
public class ArticleTask {
    @Autowired
    private ArticleService articleService;

    @Scheduled(cron = "0/30 * * * * ?")
    public void toSaveArtByNetEase() {
        log.info("开始爬取文章了");
        List<Article> toSaveArticles = HtmlParseUtil.getArtByNetEase();
        if (ObjectUtil.isNotEmpty(toSaveArticles)) {
            boolean saveArticleList = articleService.toSaveArticleList(toSaveArticles);
            log.info("{}时====文章保存==={}===", LocalDateTime.now(),saveArticleList);
        }
    }
}
