package com.hesm.refrofitdemo.bean;

import java.util.List;

/**
 * Created by hesm on 2017/8/30.
 */

public class TechBean {


    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-08-30 20:55","title":"微信官方发布八月朋友圈十大谣言：《战狼2》并非诱导病毒木马","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1981627421_300240/0","url":"http://tech.qq.com/a/20170830/176322.htm"},{"ctime":"2017-08-30 15:51","title":"我就是那个被挖走的\u201c知乎大V\u201d恶魔奶爸，我有话要说","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1979977220_300240/0","url":"http://tech.qq.com/a/20170830/113293.htm"},{"ctime":"2017-08-30 11:43","title":"三大运营商9月1日取消长途漫游费：无需申请自动生效","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1979177392_300240/0","url":"http://tech.qq.com/a/20170830/063022.htm"},{"ctime":"2017-08-30 10:30","title":"快递垃圾困境：这些包装废弃物真的无解吗？","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1978876816_300240/0","url":"http://tech.qq.com/a/20170830/049450.htm"},{"ctime":"2017-08-30 10:12","title":"共享豪车现身杭州：30元开兰博基尼50元开劳斯莱斯","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1978811609_300240/0","url":"http://tech.qq.com/a/20170830/047006.htm"},{"ctime":"2017-08-30 08:58","title":"广州约谈6家共享单车企业：再增投放立刻封存","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1978572285_300240/0","url":"http://tech.qq.com/a/20170830/034472.htm"},{"ctime":"2017-08-30 08:52","title":"三星苹果把手机带到1000美元时代：为了利润的赌博","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1978558702_300240/0","url":"http://tech.qq.com/a/20170830/033141.htm"},{"ctime":"2017-08-30 07:15","title":"iPhone 8被看好，苹果股价创新高市值8400亿美元","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1978383321_300240/0","url":"http://tech.qq.com/a/20170830/015892.htm"},{"ctime":"2017-08-30 08:25","title":"\u201c奇葩共享\u201d不是真正的共享经济","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1978501486_300240/0","url":"http://tech.qq.com/a/20170830/027587.htm"},{"ctime":"2017-08-30 07:54","title":"外卖大战下半场：烧钱进加时还是资本点球大战？","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/1978441143_300240/0","url":"http://tech.qq.com/a/20170830/021728.htm"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2017-08-30 20:55
         * title : 微信官方发布八月朋友圈十大谣言：《战狼2》并非诱导病毒木马
         * description : 腾讯科技
         * picUrl : http://inews.gtimg.com/newsapp_ls/0/1981627421_300240/0
         * url : http://tech.qq.com/a/20170830/176322.htm
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
