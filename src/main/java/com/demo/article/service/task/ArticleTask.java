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

/**
 * @Description 文章定时任务操作
 * @Author 小乌龟
 * @Date 2022/9/20 19:08
 */
@Slf4j
@Component
public class ArticleTask {
    @Autowired
    private ArticleService articleService;

    /**
      *定时任务保存文章 每天8:00:48
      * @return void
      * @author zhangjunrong
      * @date 2022/9/20 19:49
      */
//    @Scheduled(cron = "48 0 8 * * ? ")
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
