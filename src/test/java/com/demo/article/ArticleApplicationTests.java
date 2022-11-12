package com.demo.article;


import com.demo.article.utils.HtmlParseUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ArticleApplicationTests {

    @Test
    void contextLoads()  {
        //测试爬取资源
        HtmlParseUtil.getArtByNetEase();
    }


}
