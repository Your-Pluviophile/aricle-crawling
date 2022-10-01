package com.demo.article;

import com.demo.article.Constant.SystemConstant;
import com.demo.article.utils.HtmlParseUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@SpringBootTest
class ArticleApplicationTests {

    @Test
    void contextLoads()  {
        //测试爬取资源
        HtmlParseUtil.getArtByNetEase();
    }


}
