class Aula_2 {
    
    public static void main(String[] args) {
        
        System.out.println("===== Aula 02 =====");

        int x,y;
        x = 5;
        y = 2 * x;

        System.out.println("valor de X: " + x); // 5
        System.out.println("valor de Y: " + y); // 10

        double z;
        z =  2 * x;

        System.out.println("valor de Z: " + z); // 10.0

        System.out.println("===== Exemplo 2 =====");
        
        double b,B,h,area;

        b = 6.0;
        B = 8.0;
        h = 5.0;
    
        area = (b + B) / 2.0 * h;
        System.out.println("valor da área: " + area); // 35.0

        // ou

        System.out.println("===== Exemplo 3 =====");

        float _b,_B,_h,_area;

        _b = 6f;
        _B = 8f;
        _h = 5f;
    
        _area = (_b + _B) / 2f * _h;
        System.out.println("valor da área com float: " + _area); // 35.0

        System.out.println("===== Exemplo 4 =====");

        int __a, __b;
        double __resultado;

        __a = 5;
        __b = 2;

        __resultado = (double) __a / __b;
        System.out.println("valor do resultado: " + __resultado); // 2.5

        System.out.println("===== Exemplo 5 =====");

        double w;
        int j;

        w = 5.0;
        j = (int) w;

        System.out.println("valor de j: " + j); // 5

    }
}
