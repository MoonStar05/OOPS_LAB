package WEEK_07;
class mid_2{
    public static void somemethod2() throws Exception{
        throw new Exception("exception occured");
    }
    public static void somemethod() throws Exception{
        try{
            somemethod2();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        try{
            somemethod();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
