package week4.task1
public class CamSanh extends Cam{
  public CamSanh(int gia, String Season){
  super(gia,Season);
  }
  /**
   * xem gia ban
   */
  public void xemgia()
  {
   System.out.print("Gia ban: " + gia);
  }
  /**
   * hoa qua mua gi
   */
  public void muagi()
  {
   System.out.printf("Hoa qua mua: " + Season);
  }
  }
