package com.company;
// Класс NonGen - функциональный эквивалент класса Gen без обобщений

public class NonGen {
    Object ob; // объект оЬ теперь имеет тип OЬject

    //передать конструктору ссылку на объект типа OЬject
    NonGen(Object o) {
        ob = o;
    }

    //возвратить тип OЬject
    Object getob() {
        return ob;
    }

    //показать тип объекта оЬ
    void showType() {
        System.out.println("Oбъeкт оЬ относится к типу " + ob.getClass().getName());
    }
}
//продемонстрировать необобщенный класс
class NonGenDemo {
    public static void main(String args[]) {
        NonGen iOb;
//создать объект типа NonGen и сохранить в нем
//объект типа Integer. Выполняется автоупаковка
        iOb = new NonGen(88);
//показать тип данных, хранящихся в переменной iOb
        iOb.showType();
//получить значение переменной iОЬ,
//на этот раз требуется приведение типов
        int v = (Integer) iOb.getob();
        System.out.println("Знaчeниe : " + v);
        System.out.println();
//создать другой объект типа NonGen и
//сохранить в нем объект типа Strinq
        NonGen strOb = new NonGen("Tecт без обобщений");
//показать тип данных, хранящихся в переменной strOb
        strOb.showType();
//получить значение переменной strOb,
// И в этом случае потребуется приведение типов
        String str = (String)strOb.getob();
        System.out.println("Знaчeниe : " + str);
//этот код компилируется, но он принципиально неверный!
        iOb = strOb;
        v = (Integer)iOb.getob();//Ошибка во время выполнения!
    }
}