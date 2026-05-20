public class Dashed {
    public static void main(String arg[]){
        int w,b;
        w = 20;
        b = 40;
        if(w<b) System.out.println("Mohameds gets all over");
        w = w * 2;
        if(w==b) System.out.println("Mohamed repents and then hell move on to conquer more and more out of life");
        w = w * 2;
        if(w>b) System.out.println("From the conquest on to the next, theres energy still in the tank");
        if(w==b) System.out.println("This line will be a blind spot");

        System.out.println("\n");

        int t;
        for(t=0; t<10; t=t+1){
            System.out.println("My journey goes on repeat till: " + t);
        }

        System.out.println("\n");

        int g,o;
        o = 20;
        for(g=0;g<10;g++){
            System.out.println("Itll count this way: " + g);
            System.out.println("Itll count that way: " + o);
            o = o - 2;
        }

        System.out.println("\n");

        int dashspeed;
        long days;
        long seconds;
        long distance;

        dashspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = dashspeed * seconds;

        System.out.print("In " + days);
        System.out.print(" days ill dash it at about ");
        System.out.println(distance + " miles. ");

        System.out.println("\n");

        double pi,r,a;
        r = 10.8;
        pi = 3.1416;
        a = pi * r * r;
        System.out.println("i feel as though ill be traveling at around the circle at: " + a);

        System.out.println("\n");

        char mohamed1,Alterego;
        mohamed1 = 88;
        Alterego = 'Y';
        System.out.print("Mohamed and his alterego are like: ");
        System.out.println(mohamed1 + " " + Alterego);

        System.out.println("\n");

        char mohamed;
        mohamed = 'X';
        System.out.println("Mohamed contains: " + mohamed);
        mohamed++;
        System.out.println("Mohamed is now " + mohamed);

        double v=3.0, u=4.0;
        double c = Math.sqrt(v * v + u * u);
        System.out.println("Mohamed feels like: " + c);

        System.out.println("\n");

        int e;
        e=10;
        for(e=0; e<10; e++){
            int h = 20;
            h = h + 30;
            System.out.println("Mohamed and his alterego is: " + e + " " + h);
            e = h;
        }
        System.out.println("So lets us simmerdown at " + e);


    }


    }
