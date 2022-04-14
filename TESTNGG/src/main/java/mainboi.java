import org.testng.annotations.Test;
public class mainboi {

    @Test(groups = {"Maulick"})
    public void func1()
    {
        System.out.println("Function 1 is running");
    }
    @Test(groups={"Maulick","mau"})
    public void func2()
    {
        System.out.println("Function 2 is running");
    }
    @Test(groups={"mau"})
    public void func3()
    {
        System.out.println("3rd Function");
    }


}
