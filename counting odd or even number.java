import java.util.*;
class oddEven{


public int isoddeven(int input1, input2,input3,input4,input5,String input6){

int count=0;
        if(input6.equalsIgnoreCase("odd")){
            if(input1%2!=0){
                count+=1;
            }
             if(input2%2!=0){
                count+=1;
            }
             if(input3%2!=0){
                count+=1;
            }
             if(input4%2!=0){
                count+=1;
            }
             if(input5%2!=0){
                count+=1;
            }
           
        }
        else {
            if(input1%2==0){
                count+=1;
            }
             if(input2%2==0){
                count+=1;
            }
             if(input3%2==0){
                count+=1;
            }
             if(input4%2==0){
                count+=1;
            }
             if(input5%2==0){
                count+=1;
            }
            
        }
		return count;
	}
}
