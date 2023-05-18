public class hollowrectangle {
    public static void hollowrectangle(int totalrows,int totalcols){
        for(int i=1;i<=totalrows;i++){
            for(int j=1;j<=totalcols;j++){
                  //cell=(i,j)
                if(i==1||i==totalrows||j==1||j==totalcols){
                    //this is for boundary cells
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollowrectangle(10,7);

    }
    
}
