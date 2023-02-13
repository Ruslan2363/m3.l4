import java.util.*;


public class Main {
    public static  void main(String[] args) {

        String[] масивПрізвищ=  { "Антоно","Шевченко","Бойко","Шевченко", "Кравченко", "Савицький", "Антонов", "Шевченко", "Тетерів", "Мамченко"};

        List<String> списокПрізвищ= new ArrayList<>();
        for (String прізвища : масивПрізвищ){
            списокПрізвищ.add(прізвища);
            System.out.println(прізвища);
        }


        Set<String> набірПрізвищ=new TreeSet<>();
        for (String прізвища: масивПрізвищ) {
            набірПрізвищ.add(прізвища);
        }
        System.out.println(набірПрізвищ);




        Map<String, Integer> кількістьЛітер = new TreeMap();
        for (String прізвища: масивПрізвищ) {
            кількістьЛітер.put((прізвища),(прізвища).length());;
        }
        System.out.println(кількістьЛітер);












    }}
