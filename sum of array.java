public class Main
{
    public int fun(int []a,int sum,int i)
    {
        if(i==a.length)
        {
            return sum;
        }
        sum=sum+a[i];
        return fun(a,sum,i+1);
    }
    public static void main(String[] args){
        Main m=new Main();
        int []a={1,2,3,4};
        int sum=0;
        int i=0;
        System.out.println(m.fun(a,sum,i));
    }
}

