package calcuu;

public class math_op {

	public double val1;
	public double val2;
	public String op;
	public double result;
	public math_op(String operation)
	{
       op=type_op(operation);
       if(op.equals("÷")||op.equals("*")||op.equals("+")||op.equals("-")||op.equals("%"))
       {
    	   int index=operation.indexOf(op);
    	   val1=Double.parseDouble(operation.substring(0, index));
    	   val2=Double.parseDouble(operation.substring(index+1, operation.length()));
    	   if(op.equals("÷"))
    		   result=val1/val2;
    	   else if(op.equals("*"))
    		   result=val1*val2;
    	   else if(op.equals("-"))
    		   result=val1-val2;
    	   else if(op.equals("+"))
    		   result=val1+val2;
    	   else if(op.equals("%"))
    		   result=val1%val2;
       }
       else if(op.equals("^2"))
       {
    	   val1=Double.parseDouble(operation.substring(0,operation.length()-2));
    	   result=Math.pow(val1, 2);
       }
       else if(op.equals("sin")||op.equals("cos")||op.equals("tan"))
       {
    	   val1=Double.parseDouble(operation.substring(3,operation.length()));
    	   if(op.equals("sin"))
    		   result=Math.sin(val1);
    	   else if(op.equals("cos"))
    		   result=Math.cos(val1);
    	   else if(op.equals("tan"))
    		   result=Math.tan(val1);
    	  
       }
       else if(op.equals("√"))
       {
    	   val1=Double.parseDouble(operation.substring(1,operation.length()));
    	   result=Math.sqrt(val1);
       }
       
       
	}
    public String type_op(String operation) 
    {
    	if(operation.contains("*"))
    	{
    		return "*";
    	}
    	else if(operation.contains("÷"))
    	{
    		return "÷";
    	}
    	else if(operation.contains("%"))
    	{
    		return "%";
    	}
    
    	else if(operation.contains("+"))
    	{
    		return "+";
    	}
    	else if(operation.contains("-"))
    	{
    		return "-";
    	}
    	else if(operation.contains("tan"))
    	{
    		return "tan";
    	}
    	else if(operation.contains("sin"))
    	{
    		return "sin";
    	}
    	else if(operation.contains("cos"))
    	{
    		return "cos";
    	}
    	else if(operation.contains("^2"))
    	{
    		return "^2";
    	}
    	else if(operation.contains("√"))
    	{
    		return "√";
    	}
    	
    	else
    		return "";
	}
    
   
    
}
