import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] масивПрізвищ=  { "Антоно","Шевченко","Бойко","Шевченко", "Кравченко", "Савицький", "Антонов", "Шевченко", "Тетерів", "Мамченко"};
        List<String> списокПрізвищ= new ArrayList<>();
        for (String прізвища : масивПрізвищ){
            списокПрізвищ.add(прізвища);
            System.out.println(прізвища);
        }
        Set<String> набірПрізвищ=new TreeSet<>();
     набірПрізвищ.add(масивПрізвищ[0]);
        набірПрізвищ.add(масивПрізвищ[1]);
        набірПрізвищ.add(масивПрізвищ[2]);
        набірПрізвищ.add(масивПрізвищ[3]);
        набірПрізвищ.add(масивПрізвищ[4]);
        набірПрізвищ.add(масивПрізвищ[5]);
        набірПрізвищ.add(масивПрізвищ[6]);
        набірПрізвищ.add(масивПрізвищ[7]);
        набірПрізвищ.add(масивПрізвищ[8]);
        набірПрізвищ.add(масивПрізвищ[9]);
        System.out.println(набірПрізвищ);



        Map<String, Integer> кількістьЛітер = new TreeMap();
        int a= (масивПрізвищ[0]).length();
        int b= (масивПрізвищ[1]).length();
        int c= (масивПрізвищ[2]).length();
        int h= (масивПрізвищ[3]).length();
        int d= (масивПрізвищ[4]).length();
        int j= (масивПрізвищ[5]).length();
        int g= (масивПрізвищ[6]).length();
        int v= (масивПрізвищ[7]).length();
        int y= (масивПрізвищ[8]).length();
        int f= (масивПрізвищ[9]).length();
        кількістьЛітер.put((масивПрізвищ[0]),a);
        кількістьЛітер.put((масивПрізвищ[1]),b);
        кількістьЛітер.put((масивПрізвищ[2]),c);
        кількістьЛітер.put((масивПрізвищ[3]),h);
        кількістьЛітер.put((масивПрізвищ[4]),d);
        кількістьЛітер.put((масивПрізвищ[5]),j);
        кількістьЛітер.put((масивПрізвищ[6]),g);
        кількістьЛітер.put(масивПрізвищ[7],v);
        кількістьЛітер.put(масивПрізвищ[8],y);
        кількістьЛітер.put((масивПрізвищ[9]),f);
        Integer букви1 = кількістьЛітер.get(масивПрізвищ[1]);
        Integer букви2 = кількістьЛітер.get(масивПрізвищ[2]);

        System.out.println(букви1);
        System.out.println(букви2);
        System.out.println(кількістьЛітер);










    }}
