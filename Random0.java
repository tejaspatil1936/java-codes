public class Random0 {
    public static void main(String[] args) {
        VolumeCuboid(7,8,9);
        VolumeCube (7);
        VolumeSphere(5);
    }
    static void VolumeCuboid (int l , int b, int h)
    {
        int volume = l*b*h;
        System.out.println("The volume of cuboid = " +  volume);
    }
    static void VolumeCube (int l)
    {
        int volume = l*l*l;
        System.out.println("The volume of cuboid = " +  volume);
    }
    static void VolumeSphere (int r)
    {
        double volume = 4/3*3.14*r;
        System.out.println("The volume of cuboid = " +  volume);
    }
}
