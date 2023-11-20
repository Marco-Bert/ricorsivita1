public class Main {
    public static void main(String[] args) {
        System.out.println(fattoriale(10));

        System.out.println(contaCaratteriPos(0, "asjdkbgfbdfgdkljsbfldjasfnldafadfasdg", 'a'));
        System.out.println(contaCaratteriStr("asjdkbgfbdfgdkljsbfldjasfnldafadfasdg", 'a'));

        System.out.println(elevazione(5, 2));

        System.out.println(palindroma("dsfzsdgawrgdfg"));
        System.out.println(palindroma("annaanna"));

        System.out.println(menoPiu(4));
    }

    public static long fattoriale(long num){
        if(num >= 0 && num <= 1){
            return 1;
        }
        return  num * fattoriale(num - 1);
    }
    public static long contaCaratteriPos(int pos, String str, char carattere){
        if(pos == str.length() - 1){
            return (str.charAt(str.length() - 1) == carattere) ? 1 : 0;
        }
        return ((str.charAt(pos) == carattere) ? 1 : 0) + contaCaratteriPos(pos + 1, str, carattere);
    }
    public static long contaCaratteriStr(String str, char carattere){
        if(str.length() == 1){
            return (str.charAt(0) == carattere) ? 1 : 0;
        }
        return contaCaratteriStr(str.substring(0, 1), carattere) + contaCaratteriStr(str.substring(1), carattere);
    }
    public static long elevazione(long a, long b){
        if(b == 0){
            return 1;
        }
        return a * elevazione(a, b - 1);
    }
    public static boolean palindroma(String str){
        if(str.length() >= 1 && str.length() <= 2){
            return (str.length() == 2) ? (str.charAt(0) == str.charAt(1)) : true;
        }
        return ((str.charAt(0) == str.charAt(str.length() - 1)) ? true : false) && palindroma(str.substring(1, str.length() - 1));
    }
    public static String menoPiu(int n){
        if(n == 1){
            return "-+";
        }
        return "-" + menoPiu(n - 1) + "+";
    }
    
}