package home;

public class Test {

    public static void main(String[] args){

        CommadExecutorSuperVisor supervisor=new CommadExecutorSuperVisor("akash","poplu007");


        try{
        supervisor.runCommand("javac");
        }catch(Exception e){
            e.printStackTrace();
        }



    }
    
    
}
