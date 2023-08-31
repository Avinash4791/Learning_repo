class Employees
{
    int Id;
    String Name;
    float Salary;

    void SetEmployeeDetailes()
    {
        Id=535;
        Name="Gopi";
        Salary=1000.00f;
    }
    void GetEmployeeDetailes()
    {
        System.out.println("Id ="+ Id);
        System.out.println("Name ="+ Name);
        System.out.println("Salary ="+ Salary);
    }
}
public class TestMain
{

    public static void main(String[] args)
    {
        Employees e=new Employees();
        e.SetEmployeeDetailes();
        e.GetEmployeeDetailes();
        String s = new String("5");
        System.out.println(1+10+ s+1+10);



    }

}
