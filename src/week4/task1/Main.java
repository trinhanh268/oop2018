package week4.task1;

public class Main{
  public static void main(String[] args){
    Cam cam = new Cam( 20000, "Mua dong");
    CamThanhPhong CTP = new CamThanhPhong( 30000, "Mua dong");
    CamSanh CS = new CamSanh(25000, " Mua dong");
    Tao tao = new Tao(15000, " Mua he");
    cam.xemgia();
    cam.muagi();
    CTP.xemgia();
    CTP.muagi();
    CS.xemgia();
    CS.muagi();
    tao.xemgia();
    tao.muagi();
    }
}
