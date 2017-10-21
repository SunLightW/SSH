package cn.jasmine.entity.admin;


public class Honor {

  private long id;
  private String honorPic;
  private String honorTitle;
  private String honorBody;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getHonorPic() {
    return honorPic;
  }

  public void setHonorPic(String honorPic) {
    this.honorPic = honorPic;
  }


  public String getHonorTitle() {
    return honorTitle;
  }

  public void setHonorTitle(String honorTitle) {
    this.honorTitle = honorTitle;
  }


  public String getHonorBody() {
    return honorBody;
  }

  public void setHonorBody(String honorBody) {
    this.honorBody = honorBody;
  }

}
