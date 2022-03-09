package aula;

public class Main6 {
	public static void main(String[] args){
    	float cont=0, s=0;
        
        for(int i=0; i<100; i++){
        	if(i%2==1){
            	cont = cont+1;
                s = s+i;
            }
        }
        System.out.println(s/cont);
    }
}
