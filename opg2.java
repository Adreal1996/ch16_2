package ch16;

public class opg2
{
    public static void main(String[] args)
    {
        LinkedIntList liste = new LinkedIntList();
        liste.add(1);
        liste.add(50);
        liste.add(15);
        liste.add(10);
        liste.add(20);

        System.out.println(liste.biggest());
    }
}
