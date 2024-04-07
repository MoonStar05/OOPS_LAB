package WEEK_07;
class fword{
    public String fword;
    public fword(String fword){
        this.fword=fword;
    }
    public void tword(){
        for(int i=0;i<fword.length()-2;i++){
            for(int j=i+1;j<fword.length()-1;j++){
                for(int k=i+2;k<fword.length();k++){
                    System.out.println(""+fword.charAt(i)+fword.charAt(j)+fword.charAt(k));
                }
            }
        }
    }
}
class mid_4{
    public static void main(String[] args){
        fword f=new fword("bathe");
        f.tword();
    }
}