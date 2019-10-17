public class Variables
{
    public static void main(String[] args)
    {
        //defining the variables
        int myfirstnumber=5;
        System.out.println(myfirstnumber);

        //let's do some edit in the myfirstnumber
        myfirstnumber=5+10;
        System.out.println("My First Number: "+ myfirstnumber);

        //Now i'll do some calculations for multiple numbers
        int mysecondnumber=10;
        int mythirdnumber=34;

        int mytotal=myfirstnumber+mysecondnumber+mythirdnumber;//print the total value of all the nubmers
        System.out.println("Initial My Total: "+ mytotal);

        //let's make some changes to the my total numbers
        mysecondnumber=myfirstnumber*65;
        mythirdnumber=mysecondnumber/2;

        //need to update or change in the mytotal variable
        mytotal=myfirstnumber+mysecondnumber+mythirdnumber;

        System.out.println("My Total: "+ mytotal);

    }
}
