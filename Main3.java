public class Main3
{
    public int fun(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args)
    {
        Main3 m=new Main3();
        System.out.println(m.fun(1));
       
    }
}