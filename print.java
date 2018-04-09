public class MarkSheet
{
    String name;
    String Rollnumber;
    String college;
    int Hindi,English,Mathematics,Physics,Chemistry,total;
    float percent;
    
    MarkSheet()
    {
        college="ABCD COLLEGE";
        name="Mr. XYZ";
        Rollnumber="2081168";
        Hindi=76;
        English=72;
        Mathematics=83;
        Physics=77;
        Chemistry=81;
        total=Hindi+English+Mathematics+Physics+Chemistry;
        percent=total/5;
        
        System.out.println("\tCollege name  :"+college);
        System.out.println("Name :"+name+"\t    Rollnumber :"+Rollnumber);
        System.out.println("----------------------------------------------------");
        System.out.println("Subject             Marks Obtain\tMaximum Marks");
        System.out.println("Hindi               "+Hindi+"\t\t\t100");
        System.out.println("English             "+English+"\t\t\t100");
        System.out.println("Mathematics         "+Mathematics+"\t\t\t100");
        System.out.println("Physics             "+Physics+"\t\t\t100");
        System.out.println("Chemistry           "+Chemistry+"\t\t\t100");
        System.out.println("----------------------------------------------");
    
        System.out.println("Total Marks :"+total+"/500");
        System.out.println("Percent :"+percent);
        
        if(percent>=80)
        {
        	System.out.println("Grade is : A");
        }
        if(percent>=60 && percent<80)
        {
        	System.out.println("Grad is: B");
        }
        if(percent>=40 && percent<60)
        {
        	System.out.println("Grad is: C");
        }
        if(percent>=33 && percent<40)
        {
        	System.out.println("Passed");
        }
        if(percent<=33)
        {
        	System.out.println("Fail");
        }
    }
     
  
    
    public static void main(String args[])
    {
        new MarkSheet();
    }
}
