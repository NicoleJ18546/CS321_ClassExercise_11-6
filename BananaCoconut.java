/**
 * This program should accept multiple numbers as command line arguments, and print those numbers out again space separated.
 * For multiples of 3, prints "banana" instead of the number, for multiples of 7 print "coconut" instead of the number, and for the multiples of both 3 and 7 print "banana-coconut" instead of the number. 
 * For numbers smaller than 1, prints "puttputt". 
 * @author Nicole Joseph.
 */
public class BananaCoconut{
    
    /**
     * Checks if command line arguemnts are present and all numbers, else returns error message.
     * Prints the numbers in a specific format, space serpated with the rules of the class being applied.
     * @param args command line arugments.
     */
    public static void main( String [] args){
        //CLA is empty
        if(args.length<1){
         
            System.err.println("One or more numbers required as a command line argument.\nExample Usage: java BananaCoconut [number] [number] [...]");
      
        }
        //words present in CLA
        else if(!checkArgs(args)){
         
            System.err.println("One or more numbers required as a command line argument.\nExample Usage: java BananaCoconut [number] [number] [...]");     
      
        }
      
        else{   
            //prints output
            for(int k=0; k<args.length; k++){
            
                if(Integer.parseInt(args[k])<1){
                
                    if(k == args.length-1){
                        
                        System.out.print("puttputt");
                        
                    }   
                    
                    else{
                    
                        System.out.print("puttputt ");
                        
                    }            
                }
            
                else if(Integer.parseInt(args[k])%3 == 0 && Integer.parseInt(args[k])%7 == 0){

                    if(k == args.length-1){
                        
                        System.out.print("banana-coconut");
                        
                    }   
                    
                    else{
                    
                        System.out.print("banana-coconut ");
                        
                    }            
                }
            
                else if( Integer.parseInt(args[k])%7 == 0){

                    if(k == args.length-1){
                        
                        System.out.print("coconut");
                        
                    }   
                    
                    else{
                    
                        System.out.print("coconut ");
                        
                    } 
                }
            
                else if( Integer.parseInt(args[k])%3 == 0){    

                    if(k == args.length-1){
                        
                        System.out.print("banana");
                        
                    }   
                    
                    else{
                    
                        System.out.print("banana ");
                        
                    }                 
                }
            
                else{

                    if(k == args.length-1){
                        
                        System.out.print(args[k]);
                        
                    }   
                    
                    else{
                    
                        System.out.print(args[k]+ " ");
                        
                    }        
                }
            }          
        }
    }
    
    /**
     * Checks args, if there are words present, returns false, otherwise returns true.
     * @param a array of arguments.
     * @return boolean value.
     */
    private static boolean checkArgs(String [] a){
      
        boolean check = true;
      
        for(int i= 0; i<a.length; i++){
      
            check = checkNumber(a[i]);
      
            if(!check){
      
                break;
      
            }    
        }
      
        return check;
   
    }
    
    /**
     * Attempts to convert s into an int, if an exception is caught and s us a word, returns false, else, returns true.
     * @param s a string from the args array.
     * @return boolean value.
     */
    private static boolean checkNumber(String s){ 
   
        try{
   
            Integer.parseInt(s);
   
            return true;
   
        }
   
        catch(Exception e){
   
            return false;  
   
        } 
    }

}//BananaCoconut