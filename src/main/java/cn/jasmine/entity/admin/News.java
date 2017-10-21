package cn.jasmine.entity.admin;


public class News {

  private long id;
  private String newsTitle;
  private String newsDate;
  private String newsBody;
  private String newsPic;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getNewsTitle() {
    return newsTitle;
  }

  public void setNewsTitle(String newsTitle) {
    this.newsTitle = newsTitle;
  }


  public String getNewsDate() {
    return newsDate;
  }

  public void setNewsDate(String newsDate) {
    this.newsDate = newsDate;
  }


  public String getNewsBody() {
    return newsBody;
  }

  public void setNewsBody(String newsBody) {
    this.newsBody = newsBody;
  }


  public String getNewsPic() {
    return newsPic;
  }

  public void setNewsPic(String newsPic) {
    this.newsPic = newsPic;
  }

}
