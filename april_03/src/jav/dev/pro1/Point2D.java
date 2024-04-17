package jav.dev.pro1;
public class Point2D{
  private int x;
  private int y;

  public Point2D(int x, int y)
  {
    this.x=x;
    this.y=y;
  }
    
  
  public boolean equal(Point2D p2)
  {
    if(this.x==(p2).x && this.y==(p2).y){
       
      return true;
      }
      else{

      return false;
      }
  }

  public String show()
  {
	  return ("Value of X abssica is : " +x +" VAlue of Ordinate is : " +y);
  }


  public double calculateDistance(Point2D p2)
  {
    double aD=this.x-p2.x;
    double bD=this.y-p2.y;
    double response=Math.pow(Math.pow(aD,2)+Math.pow(bD,2),0.5);
    //System.out.println(response);
    return response;
    
  }







}
