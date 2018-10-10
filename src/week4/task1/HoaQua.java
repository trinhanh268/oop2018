package week4.task1;

/**
 * @author DucAnh
 */
 public class HoaQua{
  private int gia;
  private String Season;
  /**
    *@param gia gia ban trai cay
    */
  public void Setgia(int gia){
   this.gia = gia;
  }
 /**
 * @return gia gia ban
 */
  public int Getgia(){
   return gia;
  }
 /**
   *@param Season hoa qua mua gi
   */ 
 public void SetSeason(String Season){
  this.Season = Season;
 }
 /**
  * @return Season hoa qua mua gi
  */
  public String GetSeason(){
   return Season;
  }
  /**
   * constructor
   * @param gia gia ban trai cay
   * @param Season hoa qua mua gi
   */
  public HoaQua( int gia, String Season){
   this.gia = gia;
   this.Season = Season;
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
  
  
