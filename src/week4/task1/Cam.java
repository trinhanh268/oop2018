package week4.task1;

public class Cam extends HoaQua{
  public Cam(int gia, String Season)
  {
   super(gia, Season);
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
